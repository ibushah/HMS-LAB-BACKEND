package com.example.HMSPHARMACY.CONTROLLER;


import com.example.HMSPHARMACY.DTO.ProductRegistrationDTO;
import com.example.HMSPHARMACY.SERVICE.ProductRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/productRegistration")
public class ProductRegistrationController {

    @Autowired
    ProductRegistrationService productRegistrationService;

    @PostMapping("/post")
    public ResponseEntity<String> postProductRegistration(ProductRegistrationDTO productRegistrationDTO){

        return productRegistrationService.postProductRegistration(productRegistrationDTO);
    }
 }
