package com.asusoftware.managertransporterbe.user.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "User")
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Email
    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "birthday", nullable = false)
    private Date birthday;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "user_role", nullable = false)
    private UserRole userRole;

    @Column(name = "status")
    private boolean userStatus;

    @Column(name = "van_number")
    private Integer vanNumber;

    @Column(name = "number_of_transports_done", nullable = false)
    private Integer numberOfTransportsDone = 0;
}
