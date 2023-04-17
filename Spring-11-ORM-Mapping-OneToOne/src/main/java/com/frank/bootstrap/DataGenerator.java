package com.frank.bootstrap;

import com.frank.entity.Department;
import com.frank.entity.Employee;
import com.frank.enums.Gender;
import com.frank.repository.DepartmentRepository;
import com.frank.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.frank.enums.Gender.F;

@Component
public class DataGenerator implements CommandLineRunner {

    EmployeeRepository employeeRepository;
    DepartmentRepository departmentRepository;

    public DataGenerator(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();


        Employee e1 = new Employee("Frank", "Batur", "frank.batur@outlook.com", LocalDate.of(2006,04,11), 112233, Gender.F);
        Employee e2 = new Employee("James", "Leo", "James.Leo@outlook.com", LocalDate.of(2006,12,31), 50000, Gender.F);
        Employee e3 = new Employee("Sydney", "McNee", "McNee.Sydney@outlook.com", LocalDate.of(1999,01,06), 120000, Gender.F);

        Department d1= new Department("Sports", "Outdoors");
        Department d2= new Department("Software", "Developers");
        Department d3= new Department("Tools", "Hardware");

        employeeList.addAll(Arrays.asList(e1, e2, e3));
        departmentList.addAll(Arrays.asList(d1, d2, d3));

        employeeRepository.saveAll(employeeList);
        departmentRepository.saveAll(departmentList);

    }
}
