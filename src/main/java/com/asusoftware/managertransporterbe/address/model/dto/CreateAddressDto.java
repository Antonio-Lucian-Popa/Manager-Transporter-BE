package com.asusoftware.managertransporterbe.address.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateAddressDto {
    private String country;
    private String county;
    private String city;
    private String zipCode;
    private String streetNumber;
    private String details;
}
