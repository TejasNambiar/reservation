package com.casestudy.reservation.controller;

import com.casestudy.reservation.dto.AdminDto;
import com.casestudy.reservation.dto.ResponseDTO;
import com.casestudy.reservation.dto.StationsDto;
import com.casestudy.reservation.dto.TrainDto;
import com.casestudy.reservation.entity.Admin;
import com.casestudy.reservation.entity.HashMapModel;
import com.casestudy.reservation.entity.Stations;
import com.casestudy.reservation.entity.Train;
import com.casestudy.reservation.repository.AdminRepository;
import com.casestudy.reservation.repository.MapRepo;
import com.casestudy.reservation.repository.StationRepository;
import com.casestudy.reservation.util.Constants;
import com.casestudy.reservation.util.DtoPojoConverter;
import com.casestudy.reservation.util.JsonToDb;
import com.casestudy.reservation.util.NullChecks;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import static com.casestudy.reservation.util.Constants.FAILURE_DB_MESSAGE;

@Slf4j
@RestController
@RequestMapping(value = "api/railways/admin")
public class AdminController<T> {

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
    ResponseDTO<T> responseDTO;

    @Autowired
    NullChecks<T> checkIsTrue;

    @GetMapping("/stationDetails2")
    public ResponseEntity<ResponseDTO<List<Stations>>> getStationDetails2() {
        List<Stations> stationsList = stationRepository.findAll().stream().limit(2).collect(Collectors.toList());
        ResponseDTO<List<Stations>> response = new ResponseDTO<>();
        if(!CollectionUtils.isEmpty(stationsList)) {
            response.setMessage("SUCCESS");
            response.setData(stationsList);
        }else{
            response.setMessage("FAILURE");
            response.setData(null);
        }
        return ResponseEntity.ok(response);
    }

    @GetMapping("/stationByCode")
    public ResponseEntity<ResponseDTO<StationsDto>> getStationDetails(@RequestParam (value = "code", required = true) String code) {
        StationsDto dto = stationRepository.getStationByCode(code);
        ResponseDTO<StationsDto> response = new ResponseDTO<>();
        if(!ObjectUtils.isEmpty(dto)) {
            response.setMessage("SUCCESS");
            response.setData(dto);
        }else{
            response.setMessage("FAILURE");
            response.setData(null);
        }
        return ResponseEntity.ok(response);
    }

//    @GetMapping("/scheduleDetails")
//    public List<Train> getScheduleDetails() {
//        return trainsRepository.findAll();
//    }

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

//    @PostMapping("/addTrain")
//    public ResponseDTO<T> addTrainInfo(@RequestBody TrainDto trainDto) {
//
//        if(checkIsTrue.insertionNullCheck((T) trainDto)){
//            Train pojo = (Train) pojoConverter.conversionCheckPoint(trainDto);
//            trainsRepository.save(pojo);
//            responseDTO.setMessage("Train details of " + trainDto.getName().toUpperCase() + Constants.SUCCESS_DB_TRAIL_MESSAGE);
//            return responseDTO;
//        }
//        responseDTO.setMessage(Constants.FAILURE_DB_MESSAGE);
//        return responseDTO;
//    }

    @PostMapping("/addStation")
    public ResponseEntity<ResponseDTO<Stations>>  addStationInfo(@RequestBody StationsDto stationsDto) {

        ResponseDTO<Stations> response = new ResponseDTO<>();

        if (checkIsTrue.insertionNullCheck((T) stationsDto)) {
            Stations pojo = (Stations) pojoConverter.conversionCheckPoint(stationsDto);
            pojo = stationRepository.save(pojo);
            String message = "Station details of " + stationsDto.getStationName().toUpperCase() + Constants.SUCCESS_DB_TRAIL_MESSAGE;
            if (!ObjectUtils.isEmpty(pojo)) {
                response.setMessage(message);
                response.setData(pojo);
            } else {
                response.setMessage(FAILURE_DB_MESSAGE);
            }
        } else {
            response.setMessage(FAILURE_DB_MESSAGE);
        }
        return ResponseEntity.ok(response);
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
        return FAILURE_DB_MESSAGE;
    }

//    @PostMapping("/addFileData")
//    public String addStationsInfo() {
//        trainsRepository.saveAll(json.converter());
//        return "Added data to db";
//    }

}
