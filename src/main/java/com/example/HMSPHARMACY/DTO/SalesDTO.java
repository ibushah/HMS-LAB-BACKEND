package com.example.HMSPHARMACY.DTO;

import com.example.HMSPHARMACY.MODEL.ProductRegistration;

public class SalesDTO {

    ProductRegistration productRegistration;
    String productName;
    Double productQuantity ;
    Double productPrice;
    String status;

    public SalesDTO() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Double productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductRegistration getProductRegistration() {
        return productRegistration;
    }

    public void setProductRegistration(ProductRegistration productRegistration) {
        this.productRegistration = productRegistration;
    }
}
