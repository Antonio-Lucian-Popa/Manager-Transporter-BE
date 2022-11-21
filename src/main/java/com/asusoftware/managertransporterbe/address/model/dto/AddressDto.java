package com.asusoftware.managertransporterbe.address.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class AddressDto {
    private UUID id;
    private String country;
    private String county;
    private String city;
    private String zipCode;
    private String streetNumber;
    private String details;
}
