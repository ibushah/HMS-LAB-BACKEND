package com.example.HMSPHARMACY.DTO;

import com.example.HMSPHARMACY.MODEL.ProductRegistration;

public class SalesDTO {

    ProductRegistration productRegistration;
    String productName;
    Long productQuantity ;
    Double productPrice;
    String status;
    Double costPrice;
    Double totalSellingPrice;

    public SalesDTO() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Long productQuantity) {
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

    public Double getTotalSellingPrice() {
        return totalSellingPrice;
    }

    public void setTotalSellingPrice(Double totalSellingPrice) {
        this.totalSellingPrice = totalSellingPrice;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }
}
