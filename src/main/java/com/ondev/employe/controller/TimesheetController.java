package com.ondev.employe.controller;

/**
 * @author MJean-Claude
 */

import com.ondev.employe.projections.TimesheetProjection;
import com.ondev.employe.service.TimesheetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MJean-Claude
 */
@RestController
@RequestMapping("/timesheets")
@AllArgsConstructor
public class TimesheetController {

    private final TimesheetService timesheetService;

    @GetMapping("/{id}")
    public TimesheetProjection getTimesheetById(@PathVariable Long id) {
        return timesheetService.getTimesheetById(id);
    }
}
