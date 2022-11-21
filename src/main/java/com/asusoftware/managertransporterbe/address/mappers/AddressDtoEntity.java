package com.asusoftware.managertransporterbe.address.mappers;

import com.asusoftware.managertransporterbe.address.model.Address;
import com.asusoftware.managertransporterbe.address.model.dto.AddressDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressDtoEntity {

    Address addressToEntity(AddressDto addressDto);
}
