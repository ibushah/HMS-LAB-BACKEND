package com.example.HMSPHARMACY.DTO;

import com.example.HMSPHARMACY.MODEL.ProductRegistration;

public class ProductDTO {

    Long id;
    String name;
    ProductRegistration productRegistration;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, ProductRegistration productRegistration) {
        this.id = id;
        this.name = name;
        this.productRegistration = productRegistration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductRegistration getProductRegistration() {
        return productRegistration;
    }

    public void setProductRegistration(ProductRegistration productRegistration) {
        this.productRegistration = productRegistration;
    }
}
