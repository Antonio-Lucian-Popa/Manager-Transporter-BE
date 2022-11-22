package com.asusoftware.managertransporterbe.user.mappers;

import com.asusoftware.managertransporterbe.user.model.User;
import com.asusoftware.managertransporterbe.user.model.dto.CreateUserDto;
import com.asusoftware.managertransporterbe.user.model.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDtoEntity {


    UserDto userToDto(User user);

    User userToEntity(CreateUserDto createUserDto);
}
