package com.casestudy.reservation.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "station", schema = "case_study")
public class Stations {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "station_name", nullable = false)
    private String stationName;
    @Column(name = "station_code", nullable = false)
    private String stationCode;
}
