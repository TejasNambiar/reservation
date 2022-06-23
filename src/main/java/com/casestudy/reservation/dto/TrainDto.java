package com.casestudy.reservation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class TrainDto {

    private Integer id;
    private String name;
    private String code;
    private HashMap<String, Integer> tierCost;
    private boolean sleeper;
    private boolean thirdAC;
    private boolean secondAC;
    private boolean firstAC;
    private boolean chair;
    private boolean chairAC;
}
