package com.asusoftware.managertransporterbe.user.service;

import com.asusoftware.managertransporterbe.user.exceptions.UserNotFoundException;
import com.asusoftware.managertransporterbe.user.mappers.CompanyDtoEntity;
import com.asusoftware.managertransporterbe.user.mappers.UserDtoEntity;
import com.asusoftware.managertransporterbe.user.model.User;
import com.asusoftware.managertransporterbe.user.model.dto.CreateCompanyDto;
import com.asusoftware.managertransporterbe.user.model.dto.CreateUserDto;
import com.asusoftware.managertransporterbe.user.repository.CompanyRepository;
import com.asusoftware.managertransporterbe.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;
    private final UserDtoEntity userDtoEntity;
    private final CompanyDtoEntity companyDtoEntity;

    public void createAdmin(CreateUserDto createUserDto) {
        userRepository.save(userDtoEntity.userToEntity(createUserDto));
    }

    public void create(CreateUserDto createUserDto, UUID adminId) {
        User admin = userRepository.findById(adminId).orElseThrow(() -> new UserNotFoundException("User not found!"));
        userRepository.save(userDtoEntity.userToEntity(createUserDto));
    }

    public void createCompany(CreateCompanyDto createCompanyDto) {
        companyRepository.save(companyDtoEntity.companyToEntity(createCompanyDto));
    }
}
