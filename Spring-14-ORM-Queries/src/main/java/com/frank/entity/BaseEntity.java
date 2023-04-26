package com.frank.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

    @Id
    // id is already given in sql, that is why we do not need below annotation
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
