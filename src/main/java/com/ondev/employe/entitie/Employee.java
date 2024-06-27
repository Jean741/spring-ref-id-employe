package com.ondev.employe.entitie;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
/**
 * @author MJean-Claude
 */
@Data
@Entity
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonSerialize
@JsonDeserialize
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "employee")
    @Builder.Default
    private List<Address> addresses = new ArrayList<>();

    @OneToMany(mappedBy = "employee")
    @Builder.Default
    private List<Timesheet> timesheets = new ArrayList<>();

}

