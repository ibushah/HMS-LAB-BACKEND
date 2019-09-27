package com.example.HMSPHARMACY.SERVICE;

import com.example.HMSPHARMACY.DTO.ProductRegistrationDTO;
import com.example.HMSPHARMACY.DTO.ProductStockDTO;
import com.example.HMSPHARMACY.MODEL.ProductRegistration;
import com.example.HMSPHARMACY.REPOSITORY.ProductRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductRegistrationService {

    @Autowired
    ProductRegistrationRepository productRegistrationRepository;

    public ResponseEntity<String> postProductRegistration(ProductRegistrationDTO productRegistrationDTO) {
        ProductRegistration productRegistration = new ProductRegistration();
        productRegistration.setProductName(productRegistrationDTO.getProductName());
        productRegistration.setCompanyProd(productRegistrationDTO.getCompanyProd());
        productRegistration.setDrugFormation(productRegistrationDTO.getDrugFormation());
//        productRegistration.setStock(productRegistrationDTO.getStock());
        productRegistration.setUnitPrice(productRegistrationDTO.getUnitPrice());
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


    public ResponseEntity<String> updateProductStocks(ProductStockDTO productStockDTO){

        Optional<ProductRegistration> productRegistration = productRegistrationRepository.findById(productStockDTO.getId());
        if(productRegistration != null){
            ProductRegistration productRegistration1 = productRegistration.get();

                productRegistration1.setMaxStock(productStockDTO.getMaxStock() - productStockDTO.getProductQuantity());
            if(productRegistration1.getMaxStock() > productRegistration1.getMinStock()) {
                productRegistrationRepository.save(productRegistration1);
                return new ResponseEntity<String>("\"maxStock Updated successfully \"", HttpStatus.OK);
            }
            else{
                return new ResponseEntity<String>("\"PRODUCTOUTOFSTOCK\"", HttpStatus.OK);
            }
        }
        return new ResponseEntity<String>("\"Not Found \"", HttpStatus.OK);

    }


    public ResponseEntity<String> updateProductRegistration(Long id,ProductRegistrationDTO productRegistrationDTO){

        ProductRegistration productRegistration=productRegistrationRepository.findById(id).get();
        if(productRegistration!=null){

            productRegistration.setProductName(productRegistrationDTO.getProductName());
            productRegistration.setStatus("Active");
            productRegistration.setRunningProduct(productRegistrationDTO.getRunningProduct());
            productRegistration.setPacking(productRegistrationDTO.getPacking());
            productRegistration.setMinStock(productRegistrationDTO.getMinStock());
            productRegistration.setMaxStock(productRegistrationDTO.getMaxStock());
            productRegistration.setFormula(productRegistrationDTO.getFormula());
            productRegistration.setBoxRate(productRegistrationDTO.getBoxRate());
            productRegistration.setActiveProduct(productRegistrationDTO.getActiveProduct());
            productRegistration.setDrugFormation(productRegistrationDTO.getDrugFormation());
            productRegistration.setCompanyProd(productRegistrationDTO.getCompanyProd());
            productRegistration.setUnitPrice(productRegistrationDTO.getUnitPrice());
            productRegistrationRepository.save(productRegistration);
            return new ResponseEntity<String>("\"Product Registered Updated successfully\"", HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<String>("\"Product Registered deleted successfully saved\"", HttpStatus.NOT_FOUND);
        }

    }
    public ProductRegistration getProductRegistration(Long id){
       ProductRegistration productRegistration= productRegistrationRepository.findById(id).get();
        if(productRegistration!=null){
            return productRegistration;
        }
        else {

            return null;
        }
    }


}