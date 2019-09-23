package com.example.HMSPHARMACY.MODEL;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String productName;
    Double productQuantity ;
    Double productPrice;
    String status;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    ProductRegistration productRegistrations;


    @ManyToOne
    @JoinColumn(name = "bulksave_id", nullable = false)
    private BulkSave bulksave;

    public Sales() {
    }

    public ProductRegistration getProductRegistrations() {
        return productRegistrations;
    }

    public void setProductRegistrations(ProductRegistration productRegistrations) {
        this.productRegistrations = productRegistrations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public BulkSave getBulksave() {
        return bulksave;
    }

    public void setBulksave(BulkSave bulksave) {
        this.bulksave = bulksave;
    }
}
