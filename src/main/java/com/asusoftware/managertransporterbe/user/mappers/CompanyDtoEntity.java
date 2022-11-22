package com.asusoftware.managertransporterbe.user.mappers;

import com.asusoftware.managertransporterbe.user.model.Company;
import com.asusoftware.managertransporterbe.user.model.dto.CompanyDto;
import com.asusoftware.managertransporterbe.user.model.dto.CreateCompanyDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(uses = {UserDtoEntity.class}, componentModel = "spring")
public interface CompanyDtoEntity {

    @Mappings({
            @Mapping(source = "company.employees", target = "employees"),
    })
    CompanyDto companyToDto(Company company);

    @Mappings({
            @Mapping(source = "companyDto.employees", target = "employees"),
    })
    Company companyToEntity(CompanyDto companyDto);

    Company companyToEntity(CreateCompanyDto createCompanyDto);
}
