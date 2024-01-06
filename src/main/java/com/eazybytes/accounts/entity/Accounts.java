package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor @NoArgsConstructor
//@Table
public class Accounts extends BaseEntity{


    @Column(name="customer_id")
    private Long customerId;

    @Id
    private Long accountNumber;

    private String accountType;
    private String branchAddress;




}
