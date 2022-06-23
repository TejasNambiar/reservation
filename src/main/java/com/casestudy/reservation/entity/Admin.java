package com.casestudy.reservation.entity;

import com.casestudy.reservation.dto.AdminDto;
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
@Table(name = "admin", schema = "case_study")
public class Admin {

    @Id
    @Column(name = "admin_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminId;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "admin_name")
    private String adminName;
    @Column(nullable = false)
    private String password;
    @Column(name = "created_date")
    private String createdDate;
    @Column(name = "login_time")
    private String loginTime;
    @Column(name = "log_out_time")
    private String logOutTime;

}
