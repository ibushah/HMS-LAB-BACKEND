package com.example.HMSPHARMACY.MODEL;


import javax.persistence.*;
import java.util.List;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Long discount;

    @OneToMany(mappedBy = "company")
    List<ProductRegistration> productRegistrationList;

    @OneToMany(mappedBy = "company")
    List<Grn> grnList;


    public Company() {
    }

    public Company( String name, Long discount, List<ProductRegistration> productRegistrationList, List<Grn> grnList) {
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
