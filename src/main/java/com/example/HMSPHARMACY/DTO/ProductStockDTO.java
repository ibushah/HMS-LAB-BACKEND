package com.example.HMSPHARMACY.DTO;

public class ProductStockDTO {

    Long id;
    Long maxStock;
    Long productQuantity;

    public ProductStockDTO() {
    }

    public ProductStockDTO(Long id, Long maxStock, Long productQuantity) {
        this.id = id;
        this.maxStock = maxStock;
        this.productQuantity = productQuantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(Long maxStock) {
        this.maxStock = maxStock;
    }

    public Long getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Long productQuantity) {
        this.productQuantity = productQuantity;
    }
}
