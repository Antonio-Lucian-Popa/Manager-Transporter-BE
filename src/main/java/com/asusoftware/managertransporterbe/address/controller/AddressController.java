package com.asusoftware.managertransporterbe.address.controller;

import com.asusoftware.managertransporterbe.address.model.dto.AddressDto;
import com.asusoftware.managertransporterbe.address.model.dto.CreateAddressDto;
import com.asusoftware.managertransporterbe.address.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/address")
public class AddressController {

    private final AddressService addressService;

    @PostMapping(path = "/create")
    private void create(@RequestBody CreateAddressDto createAddressDto) {
        addressService.create(createAddressDto);
    }

    @GetMapping(path = "/findAll")
    private List<AddressDto> findAll() {
        return addressService.findAll();
    }
}
