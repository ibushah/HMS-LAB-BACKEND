package com.example.HMSPHARMACY.SERVICE;

import com.example.HMSPHARMACY.DTO.ProductRegistrationDTO;
import com.example.HMSPHARMACY.MODEL.ProductRegistration;
import com.example.HMSPHARMACY.REPOSITORY.ProductRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductRegistrationService {

    @Autowired
    ProductRegistrationRepository productRegistrationRepository;

    public ResponseEntity<String> postProductRegistration(ProductRegistrationDTO productRegistrationDTO) {
        ProductRegistration productRegistration = new ProductRegistration();
        productRegistration.setCompanyProd(productRegistrationDTO.getCompanyProd());
        productRegistration.setDrugFormation(productRegistrationDTO.getDrugFormation());
//        productRegistration.setStock(productRegistrationDTO.getStock());
        productRegistration.setActiveProduct(productRegistrationDTO.getActiveProduct());
        productRegistration.setBoxRate(productRegistrationDTO.getBoxRate());
        productRegistration.setFormula(productRegistrationDTO.getFormula());
        productRegistration.setMaxStock(productRegistrationDTO.getMaxStock());
        productRegistration.setMinStock(productRegistrationDTO.getMinStock());
        productRegistration.setPacking(productRegistrationDTO.getPacking());
        productRegistration.setStatus("Active");
        productRegistration.setRunningProduct(productRegistrationDTO.getRunningProduct());
        productRegistrationRepository.save(productRegistration);

        return new ResponseEntity<String>("\"Product Registered successfully saved\"", HttpStatus.OK);


    }

    public List<ProductRegistration> getAllProductRegistration() {
        List<ProductRegistration> productRegistration = productRegistrationRepository.findByStatus("Active");
        return productRegistration;


    }


    public ResponseEntity<String> deleteProductRegistration(Long id) {

        ProductRegistration productRegistration = productRegistrationRepository.findById(id).get();
        if (productRegistration != null) {
            productRegistration.setStatus("InActive");
            productRegistrationRepository.save(productRegistration);
            return new ResponseEntity<String>("\"Product Registered deleted successfully saved\"", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<String>("\"Company deleted saved\"", HttpStatus.OK);
        }
    }


}