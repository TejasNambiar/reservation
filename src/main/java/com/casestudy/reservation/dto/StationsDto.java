package com.casestudy.reservation.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class StationsDto {
    private int id;
    private String stationName;
    private String stationCode;

    public StationsDto(String stationName, String stationCode) {
        this.stationName = stationName;
        this.stationCode = stationCode;
    }
}
