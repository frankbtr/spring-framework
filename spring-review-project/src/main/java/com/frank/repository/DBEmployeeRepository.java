package com.frank.repository;

import com.frank.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class DBEmployeeRepository implements EmployeeRepository{

    //assume we are getting this data from db
    @Override
    public int getHourlyRate() {
        Employee employee = new Employee("Frank Batur", "IT", 65);
        return employee.getHourlyRate();
    }
}
