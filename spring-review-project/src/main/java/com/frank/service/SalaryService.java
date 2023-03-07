package com.frank.service;

import com.frank.model.Employee;
import com.frank.repository.EmployeeRepository;
import com.frank.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {

    HoursRepository hoursRepository;
    EmployeeRepository employeeRepository;

    public SalaryService(@Qualifier("regularHours") HoursRepository hoursRepository, EmployeeRepository employeeRepository) {
        this.hoursRepository = hoursRepository;
        this.employeeRepository = employeeRepository;
    }

    public void calculateRegularSalary(){
        //HourlyRateRegularHours
        //65*40
        System.out.println(employeeRepository.getHourlyRate() * hoursRepository.getHorus());
    }

}
