package com.asusoftware.managertransporterbe.user.model.dto;

import com.asusoftware.managertransporterbe.user.model.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class CompanyDto {

    private UUID id;
    private String companyName;
    private LocalDateTime createdAt;
    private List<User> employees;
}
