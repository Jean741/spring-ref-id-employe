package com.ondev.employe.repository;

import com.ondev.employe.entitie.Timesheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.ondev.employe.projections.TimesheetProjection;
/**
 * @author MJean-Claude
 */
public interface TimesheetRepository extends JpaRepository<Timesheet, Long> {

    @Query("SELECT t.id as id, t.description as description, e.id as employeeId FROM Timesheet t JOIN t.employee e WHERE t.id = :id")
    TimesheetProjection findTimesheetById(@Param("id") Long id);
}
