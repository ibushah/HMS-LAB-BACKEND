package com.example.HMSPHARMACY.CONTROLLER;

import com.example.HMSPHARMACY.DTO.CompanyDTO;
import com.example.HMSPHARMACY.MODEL.Company;
import com.example.HMSPHARMACY.SERVICE.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping("/post")
    public ResponseEntity<String> postCompany(@RequestBody CompanyDTO companyDTO)
    {return companyService.postCompany(companyDTO);}

    @GetMapping("/getAll")
    public List<Company> getAllCompanies()
    {
        return companyService.getCompanies();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCompany(@PathVariable ("id") Long id) {
        return companyService.deleteCompany(id);
    }




}
