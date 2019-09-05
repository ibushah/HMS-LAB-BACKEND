package com.example.HMSPHARMACY.DTO;

import com.example.HMSPHARMACY.MODEL.ProductRegistration;

import java.util.List;

public class DrugFormationDTO {

    Long id;
    String name;
    List<ProductRegistration> productRegistrationList;

    public DrugFormationDTO() {
    }

    public DrugFormationDTO(Long id, String name, List<ProductRegistration> productRegistrationList) {
        this.id = id;
        this.name = name;
        this.productRegistrationList = productRegistrationList;
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

    public List<ProductRegistration> getProductRegistrationList() {
        return productRegistrationList;
    }

    public void setProductRegistrationList(List<ProductRegistration> productRegistrationList) {
        this.productRegistrationList = productRegistrationList;
    }
}
