package com.asusoftware.managertransporterbe.user.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "Company")
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy="company")
    private List<User> employees;
}
