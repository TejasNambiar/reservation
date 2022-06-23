package com.casestudy.reservation.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@JsonIgnoreProperties
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "schedule", schema = "case_study")
public class Schedule {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "train_name", nullable = false)
    private String trainName;
    @Column(name = "train_number", nullable = false)
    private String trainNumber;
    @Column(name = "station_name", nullable = false)
    private String stationName;
    @Column(name = "station_Code", nullable = false)
    private String stationCode;
    private String arrival;
    private String departure;
}
