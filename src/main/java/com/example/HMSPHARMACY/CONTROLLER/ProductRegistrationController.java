package com.example.HMSPHARMACY.CONTROLLER;


import com.example.HMSPHARMACY.DTO.ProductRegistrationDTO;
import com.example.HMSPHARMACY.DTO.ProductStockDTO;
import com.example.HMSPHARMACY.MODEL.ProductRegistration;
import com.example.HMSPHARMACY.SERVICE.ProductRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/productRegistration")
public class ProductRegistrationController {

    @Autowired
    ProductRegistrationService productRegistrationService;

    @PostMapping("/post")
    public ResponseEntity<String> postProductRegistration(@RequestBody ProductRegistrationDTO productRegistrationDTO){

        return productRegistrationService.postProductRegistration(productRegistrationDTO);
    }

    @GetMapping("/getAll")
    public List<ProductRegistration> getAllProductRegistration(){
        return productRegistrationService.getAllProductRegistration();

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProductRegistration(@PathVariable ("id") Long id){

        return productRegistrationService.deleteProductRegistration(id);
        }

    @PutMapping("/update")
    public ResponseEntity<String> updateProductStocks(@RequestBody ProductStockDTO productStockDTO){
        return productRegistrationService.updateProductStocks(productStockDTO);
    }
 }
