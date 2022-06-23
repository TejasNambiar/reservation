package com.casestudy.reservation.util;

import com.casestudy.reservation.dto.AdminDto;
import com.casestudy.reservation.dto.ScheduleDto;
import com.casestudy.reservation.dto.StationsDto;
import com.casestudy.reservation.dto.TrainDto;
import com.casestudy.reservation.entity.Admin;
import com.casestudy.reservation.entity.Schedule;
import com.casestudy.reservation.entity.Stations;
import com.casestudy.reservation.entity.Train;
import com.casestudy.reservation.repository.TrainsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DtoPojoConverter<T> {

    @Autowired
    TrainsRepository repository;

    public Object conversionCheckPoint(T object) {
        switch (object.getClass().getSimpleName()) {
            case "AdminDto":
                log.info("SIMPLE NAME Admin:: " + object.getClass().getSimpleName());
                return adminPojoConversion((AdminDto) object);

            case "TrainDto":
                log.info("SIMPLE NAME Tain:: " + object.getClass().getSimpleName());
                return trainPojoConversion((TrainDto) object);

            case "ScheduleDto":
                log.info("SIMPLE NAME Schedule:: " + object.getClass().getSimpleName());
                return schedulePojoConversion((ScheduleDto) object);

            case "StationsDto":
                log.info("SIMPLE NAME Station:: " + object.getClass().getSimpleName());
                return stationPojoConversion((StationsDto) object);

            default:
                return new Object();
        }
    }

    public Admin adminPojoConversion(AdminDto adminDto) {
        return Admin.builder()
                .adminName(adminDto.getAdminName().toUpperCase())
                .firstName(adminDto.getFirstName().toUpperCase())
                .lastName(adminDto.getLastName().toUpperCase())
                .password(adminDto.getPassword())
                .build();
    }

    public Train trainPojoConversion(TrainDto trainDto) {

        return Train.builder()
                .name(trainDto.getName().toUpperCase())
                .code(trainDto.getCode().toUpperCase())
                .tierCosts(trainDto.getTierCost())
                .sleeper(trainDto.isSleeper())
                .thirdAC(trainDto.isThirdAC())
                .firstAC(trainDto.isFirstAC())
                .chair(trainDto.isChair())
                .chairAC(trainDto.isChairAC())
                .build();
    }

    public Schedule schedulePojoConversion(ScheduleDto scheduleDto) {
        return Schedule.builder()
                .stationName(scheduleDto.getStationName().toUpperCase())
                .stationCode(scheduleDto.getStationCode().toUpperCase())
                .trainName(scheduleDto.getTrainName().toUpperCase())
                .trainNumber(scheduleDto.getTrainNumber())
                .arrival(scheduleDto.getArrival())
                .departure(scheduleDto.getDeparture())
                .build();
    }

    public Stations stationPojoConversion(StationsDto stationsDto) {

        return Stations.builder()
                .stationName(stationsDto.getStationName().toUpperCase())
                .stationCode(stationsDto.getStationCode().toUpperCase())
                .build();
    }

}
