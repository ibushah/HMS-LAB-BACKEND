package com.example.HMSPHARMACY.MODEL;

import javax.persistence.*;

@Entity
public class ProductRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String formula;
    Long packing;
    Double boxRate;
    Long minStock;
    Long maxStock;
    Boolean activeProduct;
    Boolean runningProduct;

    @ManyToOne
    @JoinColumn(name = "company_id",nullable = false)
    Company company;

    @OneToOne(mappedBy = "productRegistration")
    Stock stock;

    @ManyToOne()
    @JoinColumn(name = "drugFormation_id")
    DrugFormation drugFormation;






    public ProductRegistration() {
    }

    public ProductRegistration(String formula, Long packing, Double boxRate, Long minStock, Long maxStock, Boolean activeProduct, Boolean runningProduct, Company company, Stock stock, DrugFormation drugFormation) {
        this.formula = formula;
        this.packing = packing;
        this.boxRate = boxRate;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.activeProduct = activeProduct;
        this.runningProduct = runningProduct;
        this.company = company;
        this.stock = stock;
        this.drugFormation = drugFormation;
    }

    public DrugFormation getDrugFormation() {
        return drugFormation;
    }

    public void setDrugFormation(DrugFormation drugFormation) {
        this.drugFormation = drugFormation;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


}
