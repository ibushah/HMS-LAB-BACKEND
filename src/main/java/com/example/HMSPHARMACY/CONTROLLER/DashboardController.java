package com.example.HMSPHARMACY.CONTROLLER;

import com.example.HMSPHARMACY.DTO.FilterDashboardDTO;
import com.example.HMSPHARMACY.DTO.FilterSalesByDateDTO;
import com.example.HMSPHARMACY.MODEL.BulkSave;
import com.example.HMSPHARMACY.SERVICE.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/api/dashborad")
public class DashboardController {

    @Autowired
    DashboardService dashboardService;

//    @PostMapping("/totalSales")
//    public double getFilteredSales(@RequestBody FilterDashboardDTO filterDashboardDTO) {
//          return this.dashboardService.getTotalSalesByDate(filterDashboardDTO);
//
//    }

}