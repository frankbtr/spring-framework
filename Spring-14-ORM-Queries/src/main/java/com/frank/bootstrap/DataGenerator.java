package com.frank.bootstrap;

import com.frank.repository.CourseRepository;
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
    private final CourseRepository courseRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
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


        System.out.println("------------------Employee Start --------------------");
        //jhookd@booking.com
        System.out.println("findByEmployee: " + employeeRepository.getEmployeeDetail());
        System.out.println("findByEmployee: " + employeeRepository.getEmployeeSalary());
        System.out.println("----------------------Employee End-------------------");



        System.out.println("------------------Course Start --------------");
        courseRepository.findByCategory("Spring").forEach(System.out::println);
        System.out.println("---------------");
        courseRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);
        System.out.println("---------------");
        System.out.println(courseRepository.existsByName("JavaScript for all"));
        System.out.println("---------------");
        System.out.println(courseRepository.countByCategory("Spring"));
        System.out.println("---------------");
        courseRepository.findByNameStartsWith("Scalable").forEach(System.out::println);
        System.out.println("---------------");
        courseRepository.streamByCategory("Spring").forEach(System.out::println);
        System.out.println("------------------Course End --------------");


    }
}
