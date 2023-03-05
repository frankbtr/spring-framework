package com.frank.model;

import lombok.AllArgsConstructor;
import lombok.Data;

// if the class does not have dependency or won't become a dependency for other class, you don't need to use component annotation
@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String firstName;
    private String lastName;
}
