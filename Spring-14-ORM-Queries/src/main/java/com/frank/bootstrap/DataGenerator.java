package com.frank.bootstrap;

import com.frank.repository.DepartmentRepository;
import com.frank.repository.EmployeeRepository;
import com.frank.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("---------------------REGION START--------------");
        System.out.println("findByCountry: " + regionRepository.findByCountry("Canada"));
        System.out.println("findByCountry: " + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("findByCountry: " + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountry: " + regionRepository.findByCountryContainingOrderByCountry("Asia"));
        System.out.println("findByCountry: " + regionRepository.findTop2ByCountry("Canada"));
        System.out.println("---------------------REGION END--------------");


        System.out.println("---------------------Department START--------------");
        System.out.println("findByDepartment: " + departmentRepository.findByDepartment("Toys"));
        System.out.println("findByDepartment: " + departmentRepository.findByDivisionIs("Outdoors"));
        System.out.println("findByDepartment: " + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));
        System.out.println("---------------------Department End--------------");


        System.out.println("------------------Employee Start --------------");
        //jhookd@booking.com
        System.out.println("findByEmployee: " + employeeRepository.getEmployeeDetail());
        System.out.println("findByEmployee: " + employeeRepository.getEmployeeSalary());


        System.out.println("----------------------Employee End-------------------");

    }
}
