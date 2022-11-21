package com.asusoftware.managertransporterbe.user.controller;

import com.asusoftware.managertransporterbe.user.model.dto.CreateUserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/users")
public class UserController {

    @PostMapping(path = "/create")
    private void create(@RequestBody CreateUserDto createUserDto) {}
}
