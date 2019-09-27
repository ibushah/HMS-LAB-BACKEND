package com.example.HMSPHARMACY.MODEL;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class DrugFormation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String type;
    String status;

    @OneToMany(mappedBy = "drugFormation")
    @JsonBackReference
    List<ProductRegistration> productRegistrationList;

    public DrugFormation() {
    }

    public DrugFormation(String type, String status, List<ProductRegistration> productRegistrationList) {
        this.type = type;
        this.status = status;
        this.productRegistrationList = productRegistrationList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
