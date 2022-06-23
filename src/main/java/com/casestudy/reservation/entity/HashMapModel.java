package com.casestudy.reservation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hash_map", schema = "case_study")
public class HashMapModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "train_name")
    String trainName;
    @ElementCollection
    @MapKeyColumn(name="tier")
    @Column(name="cost")
    @CollectionTable(name="tier_cost", joinColumns=@JoinColumn(name="tier_id"))
    Map<String, Integer> attributes = new HashMap<>();
}
