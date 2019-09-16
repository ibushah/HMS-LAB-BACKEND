package com.example.HMSPHARMACY.DTO;

import com.example.HMSPHARMACY.MODEL.ProductRegistration;

import java.util.List;

public class DrugFormationDTO {

    Long id;
    String type;
    List<ProductRegistration> productRegistrationList;

    public DrugFormationDTO() {
    }

    public DrugFormationDTO(Long id, String type, List<ProductRegistration> productRegistrationList) {
        this.id = id;
        this.type = type;
        this.productRegistrationList = productRegistrationList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ProductRegistration> getProductRegistrationList() {
        return productRegistrationList;
    }

    public void setProductRegistrationList(List<ProductRegistration> productRegistrationList) {
        this.productRegistrationList = productRegistrationList;
    }
}
