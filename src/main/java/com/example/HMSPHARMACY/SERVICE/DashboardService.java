package com.example.HMSPHARMACY.SERVICE;

import com.example.HMSPHARMACY.DTO.DashboardDTO;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    public DashboardDTO getDashboardByDate()
    {
        return new DashboardDTO();
    }
}
