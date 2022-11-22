package com.asusoftware.managertransporterbe.address.mappers;

import com.asusoftware.managertransporterbe.address.model.Address;
import com.asusoftware.managertransporterbe.address.model.dto.AddressDto;
import com.asusoftware.managertransporterbe.address.model.dto.CreateAddressDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressDtoEntity {

    Address addressToEntity(AddressDto addressDto);

    Address addressToEntity(CreateAddressDto createAddressDto);

    AddressDto addressToDto(Address address);
}
