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

    @Mappings({
            @Mapping(source = "user.address", target = "addressDto")
    })
    UserDto userToDto(User user);

    @Mappings({
            @Mapping(source = "createUserDto.addressDto", target = "address")
    })
    User userToEntity(CreateUserDto createUserDto);
}
