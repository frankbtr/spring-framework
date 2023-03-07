package com.frank.service;

import com.frank.repository.EmployeeRepository;
import com.frank.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OverTimeSalaryService {
    HoursRepository hoursRepository;
    EmployeeRepository employeeRepository;

    public OverTimeSalaryService(@Qualifier("OTH") HoursRepository hoursRepository, EmployeeRepository employeeRepository) {
        this.hoursRepository = hoursRepository;
        this.employeeRepository = employeeRepository;
    }

    public void calculateOverTimeSalary(){
        System.out.println(hoursRepository.getHorus());
    }
}
