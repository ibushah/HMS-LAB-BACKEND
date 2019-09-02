package com.example.HMSPHARMACY.DTO;

import com.example.HMSPHARMACY.MODEL.Product;

import java.util.List;

public class DrugFormationDTO {

    Long id;
    String name;
    List<Product> productList;

    public DrugFormationDTO() {
    }

    public DrugFormationDTO(Long id, String name, List<Product> productList) {
        this.id = id;
        this.name = name;
        this.productList = productList;
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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
