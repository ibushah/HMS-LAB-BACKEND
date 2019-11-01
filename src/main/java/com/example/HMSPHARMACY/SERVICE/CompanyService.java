package com.example.HMSPHARMACY.SERVICE;

import com.example.HMSPHARMACY.DTO.CompanyDTO;
import com.example.HMSPHARMACY.MODEL.Company;
import com.example.HMSPHARMACY.MODEL.ProductRegistration;
import com.example.HMSPHARMACY.REPOSITORY.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public ResponseEntity<String> postCompany(CompanyDTO companyDTO)
    {
        String companyName = "";
        Company company=new Company();
        try{
            companyName = companyRepository.findByName(companyDTO.getName().toLowerCase());
        }catch (Exception e){
            System.out.println(e);
        }
        if(companyName!=null) {
            return new ResponseEntity<String>("\"DUPLICATE\"", HttpStatus.ALREADY_REPORTED);
        }
        else {

            company.setName(companyDTO.getName());
            company.setDiscount(companyDTO.getDiscount());
            company.setStatus("Active");
            companyRepository.save(company);

            return new ResponseEntity<String>("\"Company successfully saved\"", HttpStatus.OK);
        }
    }

    public List<Company> getCompanies()
    {
       List<Company>company=companyRepository.findByStatus("Active");
       return company;

    }
    public ResponseEntity<String> deleteCompany(Long id ){

        Company company=companyRepository.findById(id).get();
        if(company!=null) {
            company.setStatus("InActive");
            companyRepository.save(company);

            return new ResponseEntity<String>("\"Company deleted saved\"", HttpStatus.OK);
        }
        else{

            return new ResponseEntity<String>("\"Company not found \"", HttpStatus.NOT_FOUND);
        }
    }
}
