package com.asusoftware.managertransporterbe.address.service;

import com.asusoftware.managertransporterbe.address.mappers.AddressDtoEntity;
import com.asusoftware.managertransporterbe.address.model.dto.AddressDto;
import com.asusoftware.managertransporterbe.address.model.dto.CreateAddressDto;
import com.asusoftware.managertransporterbe.address.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;
    private final AddressDtoEntity addressDtoEntity;

    public void create(CreateAddressDto createAddressDto) {
        addressRepository.save(addressDtoEntity.addressToEntity(createAddressDto));
    }

    public List<AddressDto> findAll() {
        return addressRepository.findAll().stream().map(addressDtoEntity::addressToDto).collect(Collectors.toList());
    }
}
