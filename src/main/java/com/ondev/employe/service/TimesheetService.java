package com.ondev.employe.service;

import com.ondev.employe.projections.TimesheetProjection;
import com.ondev.employe.repository.TimesheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author MJean-Claude
 */
@Service
public class TimesheetService {

    @Autowired
    private TimesheetRepository timesheetRepository;

    public TimesheetProjection getTimesheetById(Long id) {
        return timesheetRepository.findTimesheetById(id);
    }
}
