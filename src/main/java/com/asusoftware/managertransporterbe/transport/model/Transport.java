package com.asusoftware.managertransporterbe.transport.model;

import com.asusoftware.managertransporterbe.customer.model.Customer;
import com.asusoftware.managertransporterbe.user.model.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "Transport")
@Table(name = "transport")
public class Transport {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "end_date", nullable = false)
    private Date endDate;

    @Column(name = "price", nullable = false)
    private String price;

    @Column(name = "transport_documents", nullable = false)
    private String transportDocuments;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "created_by_id", referencedColumnName = "id")
    private User createdBy;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transporter_id", referencedColumnName = "id")
    private User transporter;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "start_company_id", referencedColumnName = "id")
    private Customer startCompany;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "end_company_id", referencedColumnName = "id")
    private Customer endCompany;
}
