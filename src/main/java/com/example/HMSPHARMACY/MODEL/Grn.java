package com.example.HMSPHARMACY.MODEL;


import javax.persistence.*;

@Entity
public class Grn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long invoice;
    String receivedBy;
    String productName;
    Long packing;
    Long requiredQuantity;
    Long bonusQuantity;
    Double boxTip;
    Double discount;
    Double discountedAmount;
    Double productTotalAmount;
    Double boxRate;

    @ManyToOne
    @JoinColumn(name = "company_id")
    Company company;

    public Grn() {
    }

    public Grn( Long invoice, String receivedBy, String productName, Long packing, Long requiredQuantity, Long bonusQuantity, Double boxTip, Double discount, Double discountedAmount, Double productTotalAmount, Double boxRate, Company company) {
        this.id = id;
        this.invoice = invoice;
        this.receivedBy = receivedBy;
        this.productName = productName;
        this.packing = packing;
        this.requiredQuantity = requiredQuantity;
        this.bonusQuantity = bonusQuantity;
        this.boxTip = boxTip;
        this.discount = discount;
        this.discountedAmount = discountedAmount;
        this.productTotalAmount = productTotalAmount;
        this.boxRate = boxRate;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInvoice() {
        return invoice;
    }

    public void setInvoice(Long invoice) {
        this.invoice = invoice;
    }

    public String getReceivedBy() {
        return receivedBy;
    }

    public void setReceivedBy(String receivedBy) {
        this.receivedBy = receivedBy;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getPacking() {
        return packing;
    }

    public void setPacking(Long packing) {
        this.packing = packing;
    }

    public Long getRequiredQuantity() {
        return requiredQuantity;
    }

    public void setRequiredQuantity(Long requiredQuantity) {
        this.requiredQuantity = requiredQuantity;
    }

    public Long getBonusQuantity() {
        return bonusQuantity;
    }

    public void setBonusQuantity(Long bonusQuantity) {
        this.bonusQuantity = bonusQuantity;
    }

    public Double getBoxTip() {
        return boxTip;
    }

    public void setBoxTip(Double boxTip) {
        this.boxTip = boxTip;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getDiscountedAmount() {
        return discountedAmount;
    }

    public void setDiscountedAmount(Double discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    public Double getProductTotalAmount() {
        return productTotalAmount;
    }

    public void setProductTotalAmount(Double productTotalAmount) {
        this.productTotalAmount = productTotalAmount;
    }

    public Double getBoxRate() {
        return boxRate;
    }

    public void setBoxRate(Double boxRate) {
        this.boxRate = boxRate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
