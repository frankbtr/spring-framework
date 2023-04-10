package com.frank.entity;

import com.frank.enums.Gender;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
// put table name with 's' is a common practice
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "studentFirstname")
    private String firstName;
    @Column(name = "studentLastname")
    private String lastName;
    private String email;


    //this annotation helps us to did not bring this field to table
    @Transient
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate brithDate;
    @Column(columnDefinition = "TIME")
    private LocalTime brithTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate getBrithDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
