package com.ondev.employe;

import com.ondev.employe.entitie.Employee;
import com.ondev.employe.repository.AddressRepository;
import com.ondev.employe.repository.EmployeeRepository;
import com.ondev.employe.repository.TimesheetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringRefIdEmployeApplication implements CommandLineRunner {
    private final EmployeeRepository employeeRepository;
    private final AddressRepository addressRepository;
    private final TimesheetRepository timesheetRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringRefIdEmployeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee employe1 = Employee.builder().name("Jean").build();
        employeeRepository.save(employe1);
    }
}
