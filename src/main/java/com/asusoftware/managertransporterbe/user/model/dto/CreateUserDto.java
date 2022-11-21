package com.asusoftware.managertransporterbe.user.model.dto;

import com.asusoftware.managertransporterbe.user.model.UserRole;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CreateUserDto {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date birthday;
    private UserRole userRole;
    private boolean userStatus;
    private Integer vanNumber;

}
