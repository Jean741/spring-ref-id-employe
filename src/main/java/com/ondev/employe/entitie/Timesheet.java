package com.ondev.employe.entitie;

import jakarta.persistence.*;
import lombok.Data;
/**
 * @author MJean-Claude
 */
@Data
@Entity
public class Timesheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
