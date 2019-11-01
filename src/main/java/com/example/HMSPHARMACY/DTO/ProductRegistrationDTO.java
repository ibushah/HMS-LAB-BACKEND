package com.example.HMSPHARMACY.DTO;

import com.example.HMSPHARMACY.MODEL.Company;
import com.example.HMSPHARMACY.MODEL.DrugFormation;

public class ProductRegistrationDTO {
        Long id;
        Double unitPrice;
        String productName;
        String formula;
        Long packing;
        Double boxRate;
        Long minStock;
        Long maxStock;
       String state;
       Double sellingPrice;

        Company companyProd;


        DrugFormation drugFormation;

    public ProductRegistrationDTO() {
    }

    public ProductRegistrationDTO(Long id, Double unitPrice, String productName, String formula, Long packing, Double boxRate, Long minStock, Long maxStock, String state, Double sellingPrice, Company companyProd, DrugFormation drugFormation) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.productName = productName;
        this.formula = formula;
        this.packing = packing;
        this.boxRate = boxRate;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.state = state;
        this.sellingPrice = sellingPrice;
        this.companyProd = companyProd;
        this.drugFormation = drugFormation;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Company getCompanyProd() {
        return companyProd;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setCompanyProd(Company companyProd) {
        this.companyProd = companyProd;
    }


    public DrugFormation getDrugFormation() {
        return drugFormation;
    }

    public void setDrugFormation(DrugFormation drugFormation) {
        this.drugFormation = drugFormation;
    }
}
