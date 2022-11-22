package com.asusoftware.managertransporterbe.user.controller;

import com.asusoftware.managertransporterbe.user.model.dto.CreateCompanyDto;
import com.asusoftware.managertransporterbe.user.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/company")
public class CompanyController {

    private final CompanyService companyService;


    /**
     * Create company
     * @param createCompanyDto
     */
    @PostMapping(path = "/create")
    private void createAdmin(@RequestBody CreateCompanyDto createCompanyDto) {
        companyService.create(createCompanyDto);
    }
}
