package com.example.HMSPHARMACY.MODEL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dispensary {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;
    private Long stock;
    private Double price;
    private String status;

    public Dispensary(){
    }

    public Dispensary(Long id, String name, Long stock, Double price, String status) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getStock() {
        return stock;
    }

    public Double getPrice() {
        return price;
    }

    public String getStatus() { return status; }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) { this.status = status; }
}
