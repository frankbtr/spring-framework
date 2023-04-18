package com.frank.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.SpringVersion;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "merchants")
@Data
@NoArgsConstructor
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private BigDecimal transactionFee;
    private BigDecimal commissionRate;
    private Integer payoutDelayCount;

    @OneToMany(mappedBy = "merchant") // in oneToMany relationship, ownership belongs to Many side
    private List<Payment> paymentList;

}
