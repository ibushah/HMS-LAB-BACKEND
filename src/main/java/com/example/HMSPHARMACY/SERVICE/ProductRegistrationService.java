package com.example.HMSPHARMACY.SERVICE;

import com.example.HMSPHARMACY.DTO.ChartDTO;
import com.example.HMSPHARMACY.DTO.ProductRegistrationDTO;
import com.example.HMSPHARMACY.DTO.ProductStockDTO;
import com.example.HMSPHARMACY.MODEL.ProductRegistration;
import com.example.HMSPHARMACY.REPOSITORY.ProductRegistrationRepository;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.*;

@Service
public class ProductRegistrationService {

    @Autowired
    ProductRegistrationRepository productRegistrationRepository;

    public ResponseEntity<String> postProductRegistration(ProductRegistrationDTO productRegistrationDTO) {
        String productName = "";
        ProductRegistration productRegistration = new ProductRegistration();

        try{
            productName = productRegistrationRepository.findByProductName(productRegistrationDTO.getProductName().toLowerCase());
        }catch (Exception e){
            System.out.println(e);
        }
        if(productName!=null) {
            return new ResponseEntity<String>("\"DUPLICATE\"", HttpStatus.ALREADY_REPORTED);
        }
        else{

            productRegistration.setProductName(productRegistrationDTO.getProductName());
            productRegistration.setCompanyProd(productRegistrationDTO.getCompanyProd());
            productRegistration.setDrugFormation(productRegistrationDTO.getDrugFormation());
//        productRegistration.setStock(productRegistrationDTO.getStock());
            productRegistration.setUnitPrice(productRegistrationDTO.getUnitPrice());
            // productRegistration.setActiveProduct(productRegistrationDTO.getActiveProduct());
            productRegistration.setBoxRate(productRegistrationDTO.getBoxRate());
            productRegistration.setFormula(productRegistrationDTO.getFormula());
            productRegistration.setMaxStock(productRegistrationDTO.getMaxStock());
            productRegistration.setMinStock(productRegistrationDTO.getMinStock());
            productRegistration.setPacking(productRegistrationDTO.getPacking());
            productRegistration.setStatus("Active");
            productRegistration.setState(productRegistrationDTO.getState());
            //  productRegistration.setRunningProduct(productRegistrationDTO.getRunningProduct());
            productRegistrationRepository.save(productRegistration);

            return new ResponseEntity<String>("\"Product Registered successfully saved\"", HttpStatus.OK);


        }



    }

    public List<ProductRegistration> getAllProductRegistration() {
        List<ProductRegistration> productRegistration = productRegistrationRepository.findByStatus("Active");
        productRegistration.forEach((v)-> v.setQrcode(getQRCodeImage(v.getId())));
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


    public ResponseEntity<Map<Long,String>> updateProductStocks(ProductStockDTO productStockDTO){

        Map<Long,String> map=new HashMap<Long,String>();

        Optional<ProductRegistration> productRegistration = productRegistrationRepository.findById(productStockDTO.getId());
        if(productRegistration != null){
            ProductRegistration productRegistration1 = productRegistration.get();

                productRegistration1.setMaxStock(productRegistration1.getMaxStock() - productStockDTO.getProductQuantity());
            if(productRegistration1.getMaxStock() > productRegistration1.getMinStock()) {
                productRegistrationRepository.save(productRegistration1);
                map.clear();
                map.put(productRegistration1.getMaxStock(),"MAXSTOCKUPDATED");
                return new ResponseEntity<Map<Long,String>>(map, HttpStatus.OK);
            }
            else{
                map.clear();
                map.put(productRegistration1.getMaxStock(),"PRODUCTOUTOFSTOCK");
                return new ResponseEntity<Map<Long,String>>(map, HttpStatus.OK);
            }
        }
        map.clear();
        map.put(400L,"\"NOTFOUND\"");
        return new ResponseEntity<Map<Long,String>>(map, HttpStatus.OK);

    }

    public ResponseEntity<String> updateMaxStockOnDelete(ProductStockDTO productStockDTO){

        Optional<ProductRegistration> productRegistration = productRegistrationRepository.findById(productStockDTO.getId());
        if(productRegistration != null){
            ProductRegistration productRegistration1 = productRegistration.get();
            productRegistration1.setMaxStock(productRegistration1.getMaxStock() + productStockDTO.getProductQuantity());
            productRegistrationRepository.save(productRegistration1);
            return new ResponseEntity<String>("\"MAXSTOCKADDED\"",HttpStatus.OK);
        }
        else{
            return new ResponseEntity<String>("\"NOTFOUND\"",HttpStatus.OK);
        }
    }

    public ResponseEntity<String> updateProductRegistration(Long id,ProductRegistrationDTO productRegistrationDTO){

        ProductRegistration productRegistration=productRegistrationRepository.findById(id).get();
        if(productRegistration!=null){

            productRegistration.setProductName(productRegistrationDTO.getProductName());
            productRegistration.setStatus("Active");
           // productRegistration.setRunningProduct(productRegistrationDTO.getRunningProduct());
            productRegistration.setPacking(productRegistrationDTO.getPacking());
            productRegistration.setMinStock(productRegistrationDTO.getMinStock());
            productRegistration.setMaxStock(productRegistrationDTO.getMaxStock());
            productRegistration.setFormula(productRegistrationDTO.getFormula());
            productRegistration.setBoxRate(productRegistrationDTO.getBoxRate());
          //  productRegistration.setActiveProduct(productRegistrationDTO.getActiveProduct());
            productRegistration.setState(productRegistrationDTO.getState());
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
       productRegistration.setQrcode(getQRCodeImage(id));

        if(productRegistration!=null){
            return productRegistration;
        }
        else {
            return null;
        }
    }
    public static byte[] getQRCodeImage(Long  id) {
        try {
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix bitMatrix = qrCodeWriter.encode(id.toString(), BarcodeFormat.QR_CODE, 200, 200);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "png", byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            return null;
        }
    }

    public long getregisteredproductcount(){
        return productRegistrationRepository.getAllRegisteredProducts();
    }

    public double getTotalUnitPrice(){
        return productRegistrationRepository.getTotalUnitPrice();
    }

    public List<ChartDTO> getLessStockProducts(){
        List<ChartDTO> chartData = new ArrayList<>();
        List<ProductRegistration> productList = productRegistrationRepository.getLessStockProducts();
        for(ProductRegistration product : productList){
            chartData.add(new ChartDTO(product.getProductName(),product.getMaxStock().toString()));
        }

        return chartData;
    }


}
