package com.casestudy.reservation.util;

import com.casestudy.reservation.dto.StationsDto;
import com.casestudy.reservation.dto.TrainDto;
import com.casestudy.reservation.entity.Stations;
import com.casestudy.reservation.entity.Train;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
public class JsonToDb<T> {

    @Autowired
    DtoPojoConverter<Object> pojoConverter;

    @Autowired
    NullChecks<T> checkIsTrue;

    public List<Stations> converter(){
        List<StationsDto> stationsDtoList = new ArrayList<>();
        try(InputStream inputStream = new FileInputStream("C:\\Users\\tejas\\IdeaProjects\\reservation\\src\\main\\resources\\stations.json")) {
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<StationsDto>> typeReference = new TypeReference<>() {};
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            stationsDtoList = mapper.readValue(inputStream,typeReference);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stationsDtoList.stream()
                .filter(stationsDto -> checkIsTrue.insertionNullCheck((T)stationsDto)) // null check for data from file
                .map(stationsDto -> (Stations) pojoConverter.conversionCheckPoint(stationsDto))
                .collect(Collectors.toList());
    }
}
