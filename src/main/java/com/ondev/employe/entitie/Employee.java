package com.ondev.employe.entitie;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
/**
 * @author MJean-Claude
 */
@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "employee")
    private List<Address> addresses;

    @OneToMany(mappedBy = "employee")
    private List<Timesheet> timesheets;

}

