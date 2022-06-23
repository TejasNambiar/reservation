package com.casestudy.reservation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDto {

    private String trainName;
    private String trainNumber;
    private String stationName;
    private String stationCode;
    private String arrival;
    private String departure;
}
