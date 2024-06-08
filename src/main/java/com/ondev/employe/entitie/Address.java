package com.ondev.employe.entitie;


import jakarta.persistence.*;
import lombok.Data;

/**
 * @author MJean-Claude
 */
@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}

