package com.example.HMSPHARMACY.SERVICE;

import com.example.HMSPHARMACY.DTO.FilterDashboardDTO;
import com.example.HMSPHARMACY.MODEL.BulkSave;
import com.example.HMSPHARMACY.REPOSITORY.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {


    @Autowired
    SalesRepository salesRepository;

    public double getTotalSalesByDate(FilterDashboardDTO filterDashboardDTO) throws Exception {
        double total = 0.0;
        if(filterDashboardDTO.from != null && filterDashboardDTO.till !=null){

              total = salesRepository.getSalesTotalByDate(filterDashboardDTO.getFrom(),filterDashboardDTO.getTill());
            return total;

        }
        else{
            return total;
        }

    }

}

