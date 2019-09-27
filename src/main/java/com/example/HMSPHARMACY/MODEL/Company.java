package com.example.HMSPHARMACY.MODEL;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Long discount;
    String status;

    @OneToMany(mappedBy = "companyProd")
            @JsonIgnore
    List<ProductRegistration> productRegistrationList;

    @OneToMany(mappedBy = "company")
    @JsonIgnore
    List<Grn> grnList;


    public Company() {
    }

    public Company( String status,String name, Long discount, List<ProductRegistration> productRegistrationList, List<Grn> grnList) {
        this.id = id;
        this.name = name;
        this.discount = discount;
        this.productRegistrationList = productRegistrationList;
        this.grnList = grnList;
        this.status=status;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public List<ProductRegistration> getProductRegistrationList() {
        return productRegistrationList;
    }

    public void setProductRegistrationList(List<ProductRegistration> productRegistrationList) {
        this.productRegistrationList = productRegistrationList;
    }

    public List<Grn> getGrnList() {
        return grnList;
    }

    public void setGrnList(List<Grn> grnList) {
        this.grnList = grnList;
    }
}
