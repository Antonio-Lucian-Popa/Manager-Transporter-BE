package com.asusoftware.managertransporterbe.user.mappers;

import com.asusoftware.managertransporterbe.address.mappers.AddressDtoEntity;
import com.asusoftware.managertransporterbe.user.model.User;
import com.asusoftware.managertransporterbe.user.model.dto.CreateUserDto;
import com.asusoftware.managertransporterbe.user.model.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(uses = {AddressDtoEntity.class}, componentModel = "spring")
public interface UserDtoEntity {


    UserDto userToDto(User user);

    User userToEntity(CreateUserDto createUserDto);
}
