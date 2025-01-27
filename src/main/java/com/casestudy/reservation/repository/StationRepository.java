package com.casestudy.reservation.repository;

import com.casestudy.reservation.entity.Stations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Stations,Integer> {

}
