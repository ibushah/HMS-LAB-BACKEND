package com.example.HMSPHARMACY.MODEL;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProductRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String productName;
    String formula;
    Long packing;
    Double boxRate;
    Long minStock;
    Long maxStock;
    Boolean activeProduct;
    Boolean runningProduct;
    String status;
    Double unitPrice;

    @ManyToOne
    @JoinColumn(name = "company_id",nullable = false)
    @JsonIgnore
    Company companyProd;

//    @OneToOne(mappedBy = "productRegistration")
//    Stock stock;

    @ManyToOne()
    @JoinColumn(name = "drugFormation_id")
    @JsonIgnore
    DrugFormation drugFormation;

    @OneToMany(mappedBy = "productRegistrations")
    @JsonIgnore
    List<Sales> sales;


    public ProductRegistration() {
    }

    public ProductRegistration(Double unitPrice ,String productName, String formula, Long packing, Double boxRate, Long minStock, Long maxStock, Boolean activeProduct, Boolean runningProduct, String status, Company companyProd, DrugFormation drugFormation) {
        this.productName = productName;
        this.formula = formula;
        this.packing = packing;
        this.boxRate = boxRate;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.activeProduct = activeProduct;
        this.runningProduct = runningProduct;
        this.status = status;
        this.companyProd = companyProd;
        this.drugFormation = drugFormation;
        this.unitPrice=unitPrice;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public List<Sales> getSales() {
        return sales;
    }

    public void setSales(List<Sales> sales) {
        this.sales = sales;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DrugFormation getDrugFormation() {
        return drugFormation;
    }

    public void setDrugFormation(DrugFormation drugFormation) {
        this.drugFormation = drugFormation;
    }

//    public Stock getStock() {
//        return stock;
//    }
//
//    public void setStock(Stock stock) {
//        this.stock = stock;
//    }

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

    public void setPacking(Long packing) {
        this.packing = packing;
    }

    public Double getBoxRate() {
        return boxRate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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


}
