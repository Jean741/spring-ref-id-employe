package com.ondev.employe.repository;

import com.ondev.employe.entitie.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author MJean-Claude
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
