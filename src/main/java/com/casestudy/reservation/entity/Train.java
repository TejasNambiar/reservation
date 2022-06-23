package com.casestudy.reservation.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashMap;

@Data
@Entity
@Builder
@JsonIgnoreProperties
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "train", schema = "case_study")
public class Train{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String code;
    private HashMap<String, Integer> tierCosts;
    private boolean sleeper;
    private boolean thirdAC;
    private boolean secondAC;
    private boolean firstAC;
    private boolean chair;
    private boolean chairAC;
}
