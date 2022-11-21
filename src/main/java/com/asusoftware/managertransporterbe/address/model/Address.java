package com.asusoftware.managertransporterbe.address.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "Address")
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "county", nullable = false)
    private String county;

    @Column(name = "zipCode", nullable = false)
    private String zipCode;

    @Column(name = "street_number")
    private String streetNumber;

    @Column(name = "details")
    private String details;
}
