package com.example.HMSPHARMACY.SERVICE;

import com.example.HMSPHARMACY.DTO.CompanyDTO;
import com.example.HMSPHARMACY.MODEL.Company;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CompanyService {

    public ResponseEntity<String> postCompany(CompanyDTO companyDTO)
    {
        Boolean a=true;
        if(a)
        return new ResponseEntity<String>("\"Company successfully Deleted\"", HttpStatus.OK);
        else
        {
            return new ResponseEntity<String>("\"Company successfully Deleted\"", HttpStatus.NOT_FOUND);
        }
    }

    public List<Company> getCompanies()
    {

        return  Arrays.asList(new Company(),new Company());
    }
}
