package com.example.HMSPHARMACY.MODEL;


import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    @OneToOne(mappedBy = "product")
    ProductRegistration productRegistration;

    @ManyToOne
    @JoinColumn(name = "product_id")
    DrugFormation drugFormation;

    public Product() {
    }

    public Product( String name, ProductRegistration productRegistration) {
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
