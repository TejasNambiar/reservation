package com.casestudy.reservation.controller;

import com.casestudy.reservation.dto.AdminDto;
import com.casestudy.reservation.dto.StationsDto;
import com.casestudy.reservation.dto.TrainDto;
import com.casestudy.reservation.entity.Admin;
import com.casestudy.reservation.entity.HashMapModel;
import com.casestudy.reservation.entity.Stations;
import com.casestudy.reservation.entity.Train;
import com.casestudy.reservation.repository.AdminRepository;
import com.casestudy.reservation.repository.MapRepo;
import com.casestudy.reservation.repository.StationRepository;
import com.casestudy.reservation.repository.TrainsRepository;
import com.casestudy.reservation.util.Constants;
import com.casestudy.reservation.util.DtoPojoConverter;
import com.casestudy.reservation.util.JsonToDb;
import com.casestudy.reservation.util.NullChecks;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

@Slf4j
@RestController
@RequestMapping(value = "api/railways/admin")
public class AdminController<T> {

    @Autowired
    TrainsRepository trainsRepository;

    @Autowired
    StationRepository stationRepository;

    @Autowired
    AdminRepository adminRepository;

    @Autowired
    DtoPojoConverter<Object> pojoConverter;

    @Autowired
    JsonToDb json;

    @Autowired
    MapRepo repo;

    @Autowired
    NullChecks<T> checkIsTrue;

    @GetMapping("/trainDetails")
    public List<Train> getTrainDetails() {
        return trainsRepository.findAll();
    }

    @GetMapping("/stationDetails")
    public List<Stations> getStationDetails() {
        return stationRepository.findAll();
    }

    @GetMapping("/scheduleDetails")
    public List<Train> getScheduleDetails() {
        return trainsRepository.findAll();
    }

    @GetMapping("tierData")
    public List<Map<String,Integer>> getData(){
        List<HashMapModel> hashMapModelsList = repo.findAll();
        AtomicReference<Map<String, Integer>> tierMap = new AtomicReference<>(new HashMap<>());
        List<Map<String, Integer>> list = new ArrayList<>();

        hashMapModelsList
                .forEach(model->{
                    if(list.isEmpty()){
                        tierMap.get().putAll(model.getAttributes());
                    }
                    else{
                        tierMap.set(new HashMap<>());
                        tierMap.get().putAll(model.getAttributes());
                    }
                    list.add(tierMap.get());
                });
        return list;
    }

    @PostMapping("/addTrain")
    public String addTrainInfo(@RequestBody TrainDto trainDto) {

        if(checkIsTrue.insertionNullCheck((T) trainDto)){
            Train pojo = (Train) pojoConverter.conversionCheckPoint(trainDto);
            trainsRepository.save(pojo);

            return "Train details of " + trainDto.getName().toUpperCase() + Constants.SUCCESS_DB_TRAIL_MESSAGE;
        }
        return Constants.FAILURE_DB_MESSAGE;
    }

    @PostMapping("/addStation")
    public String addStationInfo(@RequestBody StationsDto stationsDto) {

        if (checkIsTrue.insertionNullCheck((T) stationsDto)) {
            Stations pojo = (Stations) pojoConverter.conversionCheckPoint(stationsDto);
            stationRepository.save(pojo);
            return "Station details of " + stationsDto.getStationName().toUpperCase() + Constants.SUCCESS_DB_TRAIL_MESSAGE;
        }
        return Constants.FAILURE_DB_MESSAGE;
    }

    @PostMapping("/addAdmin")
    public String addAdminInfo(@RequestBody AdminDto adminDto) {
        if(checkIsTrue.insertionNullCheck((T)adminDto)){
            String adminName = adminDto.getFirstName().charAt(0) + adminDto.getLastName();
            adminDto.setAdminName(adminName);
            Admin pojo = (Admin) pojoConverter.conversionCheckPoint(adminDto);
            adminRepository.save(pojo);
            return "Admin details of " + adminDto.getFirstName().toUpperCase() + " " + adminDto.getLastName().toUpperCase() + Constants.SUCCESS_DB_TRAIL_MESSAGE;
        }
        return Constants.FAILURE_DB_MESSAGE;
    }

    @PostMapping("/addFileData")
    public String addStationsInfo() {
        trainsRepository.saveAll(json.converter());
        return "Added data to db";
    }

}
