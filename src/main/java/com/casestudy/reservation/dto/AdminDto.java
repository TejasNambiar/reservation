package com.casestudy.reservation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class AdminDto {
    private String firstName;
    private String lastName;
    private String adminName;
    private String password;
}
