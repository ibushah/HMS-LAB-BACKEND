package com.example.HMSPHARMACY.DTO;

import com.example.HMSPHARMACY.MODEL.Company;
import com.example.HMSPHARMACY.MODEL.DrugFormation;
import com.example.HMSPHARMACY.MODEL.Stock;

public class ProductRegistrationDTO {
        Long id;
        String productName;
        String formula;
        Long packing;
        Double boxRate;
        Long minStock;
        Long maxStock;
        Boolean activeProduct;
        Boolean runningProduct;

        Company companyProd;

        Stock stock;

        DrugFormation drugFormation;

    public ProductRegistrationDTO() {
    }

    public ProductRegistrationDTO(Long id, String productName, String formula, Long packing, Double boxRate, Long minStock, Long maxStock, Boolean activeProduct, Boolean runningProduct, Company companyProd, Stock stock, DrugFormation drugFormation) {
        this.id = id;
        this.productName = productName;
        this.formula = formula;
        this.packing = packing;
        this.boxRate = boxRate;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.activeProduct = activeProduct;
        this.runningProduct = runningProduct;
        this.companyProd = companyProd;
        this.stock = stock;
        this.drugFormation = drugFormation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Long getPacking() {
        return packing;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPacking(Long packing) {
        this.packing = packing;
    }

    public Double getBoxRate() {
        return boxRate;
    }

    public void setBoxRate(Double boxRate) {
        this.boxRate = boxRate;
    }

    public Long getMinStock() {
        return minStock;
    }

    public void setMinStock(Long minStock) {
        this.minStock = minStock;
    }

    public Long getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(Long maxStock) {
        this.maxStock = maxStock;
    }

    public Boolean getActiveProduct() {
        return activeProduct;
    }

    public void setActiveProduct(Boolean activeProduct) {
        this.activeProduct = activeProduct;
    }

    public Boolean getRunningProduct() {
        return runningProduct;
    }

    public void setRunningProduct(Boolean runningProduct) {
        this.runningProduct = runningProduct;
    }

    public Company getCompanyProd() {
        return companyProd;
    }

    public void setCompanyProd(Company companyProd) {
        this.companyProd = companyProd;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public DrugFormation getDrugFormation() {
        return drugFormation;
    }

    public void setDrugFormation(DrugFormation drugFormation) {
        this.drugFormation = drugFormation;
    }
}
