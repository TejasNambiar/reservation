package com.casestudy.reservation.util;

import com.casestudy.reservation.dto.AdminDto;
import com.casestudy.reservation.dto.ScheduleDto;
import com.casestudy.reservation.dto.StationsDto;
import com.casestudy.reservation.dto.TrainDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Optional;
import java.util.function.Predicate;

@Component
public class NullChecks<T> {
    public boolean insertionNullCheck(T object){
        switch (object.getClass().getSimpleName()) {
            case "AdminDto":
                return adminNullCheck((AdminDto) object);

            case "TrainDto":
                return trainNullCheck((TrainDto) object);

            case "ScheduleDto":
                return scheduleNullCheck((ScheduleDto) object);

            case "StationsDto":
                return stationNullCheck((StationsDto) object);

            default:
                return false;
        }
    }

    private boolean stationNullCheck(StationsDto object) {

        Predicate<StationsDto> nullChecks = dtoObject -> StringUtils.isNotBlank(dtoObject.getStationName()) &&
                StringUtils.isNotBlank(dtoObject.getStationCode());

        Optional<StationsDto> stationsOptional = Optional.ofNullable(object);

        return stationsOptional.isPresent() &&  nullChecks.test(object);
    }

    private boolean scheduleNullCheck(ScheduleDto object) {
        return true;
    }

    private boolean trainNullCheck(TrainDto object) {
        Predicate<TrainDto> nullChecks = dtoObject -> StringUtils.isNotBlank(dtoObject.getName()) &&
                StringUtils.isNotBlank(dtoObject.getCode()) &&
                !CollectionUtils.isEmpty(dtoObject.getTierCost());

        Optional<TrainDto> trainOptional = Optional.ofNullable(object);

        return trainOptional.isPresent() && nullChecks.test(trainOptional.get());
    }

    private boolean adminNullCheck(AdminDto object) {

        Predicate<AdminDto> nullChecks = admin -> StringUtils.isNotBlank(admin.getFirstName())
                && StringUtils.isNotBlank(admin.getLastName())
                && StringUtils.isNotBlank(admin.getPassword());

        Optional<AdminDto> adminOptional = Optional.ofNullable(object);

        return adminOptional.isPresent() && nullChecks.test(object);
    }
}
