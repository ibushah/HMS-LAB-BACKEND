package com.example.HMSPHARMACY.DTO;

import com.example.HMSPHARMACY.MODEL.Grn;
import com.example.HMSPHARMACY.MODEL.ProductRegistration;

import java.util.List;

public class CompanyDTO {

    Long id;
    String name;
    Long discount;

    List<ProductRegistration> productRegistrationList;
    List<Grn> grnList;

    public CompanyDTO() {
    }

    public CompanyDTO(Long id, String name, Long discount, List<ProductRegistration> productRegistrationList, List<Grn> grnList) {
        this.id = id;
        this.name = name;
        this.discount = discount;
        this.productRegistrationList = productRegistrationList;
        this.grnList = grnList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Grn> getGrnList() {
        return grnList;
    }

    public void setGrnList(List<Grn> grnList) {
        this.grnList = grnList;
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
}
