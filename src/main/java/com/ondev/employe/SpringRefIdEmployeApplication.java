package com.ondev.employe;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ondev.employe.entitie.Address;
import com.ondev.employe.entitie.Employee;
import com.ondev.employe.entitie.Timesheet;
import com.ondev.employe.repository.AddressRepository;
import com.ondev.employe.repository.EmployeeRepository;
import com.ondev.employe.repository.TimesheetRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class SpringRefIdEmployeApplication implements CommandLineRunner {
    private final EmployeeRepository employeeRepository;
    private final AddressRepository addressRepository;
    private final TimesheetRepository timesheetRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringRefIdEmployeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee employee1 = Employee.builder().name("Jean").build();
        employee1 = employeeRepository.save(employee1);

        Timesheet timesheet1 = Timesheet.builder().description("Timesheet 1").employee(employee1).build();
        Timesheet timesheet2 = Timesheet.builder().description("Timesheet 2").employee(employee1).build();
        Timesheet timesheet3 = Timesheet.builder().description("Timesheet 3").employee(employee1).build();
        timesheetRepository.saveAll(Arrays.asList(timesheet1,timesheet2,timesheet3));
        Address address1 = Address.builder().street("Street 1").employee(employee1).build();
        Address address2 = Address.builder().street("Street 2").employee(employee1).build();
        Address address3 = Address.builder().street("Street 3").employee(employee1).build();
        addressRepository.saveAll(Arrays.asList(address1,address2,address3));
        employee1 = employeeRepository.findById(1L).get();
        employee1.getAddresses().forEach(address -> log.info("Address: {}", address));
        employee1.getTimesheets().forEach(timesheet -> log.info("Timesheet: {}", timesheet));

    }
}
