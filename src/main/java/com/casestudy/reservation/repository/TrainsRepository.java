package com.casestudy.reservation.repository;

import com.casestudy.reservation.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainsRepository extends JpaRepository<Train, Integer> {
}
