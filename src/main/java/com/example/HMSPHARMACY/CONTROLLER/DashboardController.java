package com.example.HMSPHARMACY.CONTROLLER;

import com.example.HMSPHARMACY.DTO.DashboardDTO;
import com.example.HMSPHARMACY.SERVICE.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;

public class DashboardController {

    @Autowired
    DashboardService dashboardService;

    public DashboardDTO getDashboardByDate()
    { return dashboardService.getDashboardByDate(); }
}
