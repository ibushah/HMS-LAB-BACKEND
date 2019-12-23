package com.example.HMSPHARMACY.CONTROLLER;

import com.example.HMSPHARMACY.DTO.DashboardDTO;
import com.example.HMSPHARMACY.DTO.GetDateByDTO;
import com.example.HMSPHARMACY.SERVICE.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin
@RequestMapping("/api/dashboard")
public class DashboardController {

    @Autowired
    DashboardService dashboardService;

    public DashboardDTO getDashboardByDate()
    { return dashboardService.getDashboardByDate(); }

    @PostMapping("/productcount")
  //  @RequestMapping(value = "/pcount")
    public double productcount (@RequestBody GetDateByDTO getDateByDTO){
        return dashboardService.getregisteredproductcount(getDateByDTO);
    }

    @PostMapping("/getTotalProductPrice")
    public  Double productsum(@RequestBody GetDateByDTO getDateByDTO)
    {
        return dashboardService.getTotalProductPrice(getDateByDTO);
    }

    @PostMapping("/getSalesProfit")
    public double salesProfit(@RequestBody GetDateByDTO getDateByDTO)
    {
        return  dashboardService.getTotalSalesProfit(getDateByDTO);
    }

}
