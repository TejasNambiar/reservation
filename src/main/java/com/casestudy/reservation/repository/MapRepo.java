package com.casestudy.reservation.repository;

import com.casestudy.reservation.entity.HashMapModel;
import org.hibernate.collection.internal.PersistentMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapRepo extends JpaRepository<HashMapModel,Integer> {
    @Query(value = "select attributes from hash_map", nativeQuery = true)
    List<PersistentMap> getAttributes();
}
