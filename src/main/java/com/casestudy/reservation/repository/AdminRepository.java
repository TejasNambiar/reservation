package com.casestudy.reservation.repository;

import com.casestudy.reservation.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
