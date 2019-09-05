package com.example.HMSPHARMACY.SERVICE;

import com.example.HMSPHARMACY.DTO.ProductRegistrationDTO;
import com.example.HMSPHARMACY.MODEL.ProductRegistration;
import com.example.HMSPHARMACY.REPOSITORY.ProductRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductRegistrationService {

    @Autowired
    ProductRegistrationRepository productRegistrationRepository;

    public ResponseEntity<String> postProductRegistration(ProductRegistrationDTO productRegistrationDTO){
        ProductRegistration productRegistration=new ProductRegistration();
        productRegistration.setCompany(productRegistrationDTO.getCompany());
        productRegistration.setDrugFormation(productRegistrationDTO.getDrugFormation());
        productRegistration.setStock(productRegistrationDTO.getStock());
        productRegistration.setActiveProduct(productRegistrationDTO.getActiveProduct());
        productRegistration.setBoxRate(productRegistrationDTO.getBoxRate());
        productRegistration.setFormula(productRegistrationDTO.getFormula());
        productRegistration.setMaxStock(productRegistrationDTO.getMaxStock());
        productRegistration.setMinStock(productRegistrationDTO.getMinStock());
        productRegistration.setPacking(productRegistrationDTO.getPacking());
        productRegistration.setRunningProduct(productRegistrationDTO.getRunningProduct());
        productRegistrationRepository.save(productRegistration);
        return new ResponseEntity<String>("\"Product Registered successfully saved\"", HttpStatus.OK);



    }
}
