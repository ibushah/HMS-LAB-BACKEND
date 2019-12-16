package com.example.HMSPHARMACY.DTO;

public class DispensaryDTO {

    private Long id;
    private String name;
    private Long stock;
    private Double price;
    private String status;

    DispensaryDTO(){
    }

    public DispensaryDTO(Long id, String name, Long stock, Double price, String status) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.status = status;
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

    public Long getId() { return id; }

    public String getStatus() { return status; }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) { this.id = id; }

    public void setStatus(String status) { this.status = status; }
}
