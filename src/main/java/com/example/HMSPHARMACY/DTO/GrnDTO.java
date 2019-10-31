package com.example.HMSPHARMACY.DTO;

import com.example.HMSPHARMACY.MODEL.Company;
import com.example.HMSPHARMACY.MODEL.UserLoginInfo;

public class GrnDTO {

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
    Double transactionAmount;
    String transactionType;
    UserLoginInfo userLoginInfo;

    Company company;

    public GrnDTO() {
    }

    public GrnDTO(Long id, Long invoice, String receivedBy, String productName, Long packing, Long requiredQuantity, Long bonusQuantity, Double boxTip, Double discount, Double discountedAmount, Double productTotalAmount, Double boxRate, Company company) {
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

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public UserLoginInfo getUserLoginInfo() {
        return userLoginInfo;
    }

    public void setUserLoginInfo(UserLoginInfo userLoginInfo) {
        this.userLoginInfo = userLoginInfo;
    }
}
