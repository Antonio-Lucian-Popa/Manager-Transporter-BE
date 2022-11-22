package com.asusoftware.managertransporterbe.customer.model;

import com.asusoftware.managertransporterbe.address.model.Address;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "Customer")
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
}
