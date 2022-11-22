package com.asusoftware.managertransporterbe.user.controller;

import com.asusoftware.managertransporterbe.user.model.dto.CreateCompanyDto;
import com.asusoftware.managertransporterbe.user.model.dto.CreateUserDto;
import com.asusoftware.managertransporterbe.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/users")
public class UserController {

    private final UserService userService;

    /**
     * Only for create admin
     * @param createUserDto
     */
    @PostMapping(path = "/create-admin")
    private void createAdmin(@RequestBody CreateUserDto createUserDto) {
        userService.createAdmin(createUserDto);
    }

    /**
     * Only for other roles that are not admin
     * @param createUserDto
     */
    @PostMapping(path = "/create/{adminId}")
    private void create(@RequestBody CreateUserDto createUserDto, @PathVariable(name = "adminId") UUID adminId) {
        userService.create(createUserDto, adminId);
    }

    @PostMapping(path = "/create-company")
    private void create(@RequestBody CreateCompanyDto createCompanyDto) {}
}
