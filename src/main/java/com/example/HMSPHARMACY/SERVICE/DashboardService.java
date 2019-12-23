package com.example.HMSPHARMACY.SERVICE;

import com.example.HMSPHARMACY.DTO.DashboardDTO;
import com.example.HMSPHARMACY.DTO.GetDateByDTO;
import com.example.HMSPHARMACY.REPOSITORY.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service

public class DashboardService {

    @Autowired
    DashboardRepository dashboardRepository;
    public DashboardDTO getDashboardByDate()
    {
        return new DashboardDTO();
    }

    public double getregisteredproductcount(GetDateByDTO getDateByDTO){
        return dashboardRepository.getAllRegisteredProducts(getDateByDTO.getFrom(),getDateByDTO.getTill());
    }

    public  Double getTotalProductPrice(GetDateByDTO getDateByDTO)
    {
        return  dashboardRepository.getTotalProductUnitPrice(getDateByDTO.getFrom(),getDateByDTO.getTill());
    }

    public double getTotalSalesProfit(GetDateByDTO getDateByDTO){

        return  dashboardRepository.getSalesProfit(getDateByDTO.getFrom(),getDateByDTO.getTill());
    }


}
