package com.asusoftware.managertransporterbe.user.model.dto;

import com.asusoftware.managertransporterbe.user.model.UserRole;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class UserDto {

    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date birthday;
    private UserRole userRole;
    private boolean userStatus;
    private Integer vanNumber;
    private LocalDateTime createdAt;
    private Integer numberOfTransportsDone;
}
