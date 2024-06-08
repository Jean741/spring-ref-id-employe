package com.ondev.employe.controller;

/**
 * @author MJean-Claude
 */
import com.ondev.employe.projections.TimesheetProjection;
import com.ondev.employe.service.TimesheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author MJean-Claude
 */
@RestController
@RequestMapping("/timesheets")
public class TimesheetController {

    @Autowired
    private TimesheetService timesheetService;

    @GetMapping("/{id}")
    public TimesheetProjection getTimesheetById(@PathVariable Long id) {
        return timesheetService.getTimesheetById(id);
    }
}
