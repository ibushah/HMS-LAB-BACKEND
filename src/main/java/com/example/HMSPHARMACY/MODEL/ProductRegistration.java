package com.example.HMSPHARMACY.MODEL;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
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
    Double sellingPrice;
    String state;
    String status;
    Double unitPrice;
    byte[] qrcode;

    @Temporal(TemporalType.DATE)
    Date createddate;

    @ManyToOne
    @JoinColumn(name = "company_id",nullable = false)

    Company companyProd;

//    @OneToOne(mappedBy = "productRegistration")
//    Stock stock;

    @ManyToOne()
    @JoinColumn(name = "drugFormation_id",nullable = false)
    DrugFormation drugFormation;

    @OneToMany(mappedBy = "productRegistrations")
    @JsonIgnore
    List<Sales> sales;


    public ProductRegistration() {
    }

    public ProductRegistration(String productName, String formula, Long packing, Double boxRate, Long minStock, Long maxStock, Double sellingPrice, String state, String status, Double unitPrice, Company companyProd, DrugFormation drugFormation, List<Sales> sales,Date createddate) {
        this.productName = productName;
        this.formula = formula;
        this.packing = packing;
        this.boxRate = boxRate;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.sellingPrice = sellingPrice;
        this.state = state;
        this.status = status;
        this.unitPrice = unitPrice;
        this.companyProd = companyProd;
        this.drugFormation = drugFormation;
        this.sales = sales;
        this.createddate = createddate;
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

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Company getCompanyProd() {
        return companyProd;
    }

    public void setCompanyProd(Company companyProd) {
        this.companyProd = companyProd;
    }

    public byte[] getQrcode() {
        return qrcode;
    }

    public void setQrcode(byte[] qrcode) {
        this.qrcode = qrcode;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }


}
