package com.asusoftware.managertransporterbe.user.service;

import com.asusoftware.managertransporterbe.user.mappers.CompanyDtoEntity;
import com.asusoftware.managertransporterbe.user.model.dto.CreateCompanyDto;
import com.asusoftware.managertransporterbe.user.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final CompanyDtoEntity companyDtoEntity;

    public void create(CreateCompanyDto createCompanyDto) {
        companyRepository.save(companyDtoEntity.companyToEntity(createCompanyDto));
    }
}
