package com.example.HMSPHARMACY.DTO;

public class FilterSalesByDateDTO {

    public String from;
    public String till;

    public FilterSalesByDateDTO() {
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTill() {
        return till;
    }

    public void setTill(String till) {
        this.till = till;
    }
}
