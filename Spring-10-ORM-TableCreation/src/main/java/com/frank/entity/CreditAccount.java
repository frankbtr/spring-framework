package com.frank.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
public class CreditAccount extends Account{

    BigDecimal creditLimit;
}
