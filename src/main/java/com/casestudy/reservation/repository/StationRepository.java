package com.casestudy.reservation.repository;

import com.casestudy.reservation.dto.StationsDto;
import com.casestudy.reservation.entity.Stations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Stations,Integer> {

    @Query("SELECT new com.casestudy.reservation.dto.StationsDto(s.id, s.stationName, s.stationCode) " +
            "FROM Stations s " +
            "WHERE s.stationCode = :code")
    StationsDto getStationByCode(@Param("code") String code);

}
