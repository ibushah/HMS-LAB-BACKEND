package com.example.HMSPHARMACY.DTO;

public class Filter_DashboardDTO {

    public String from;
    public String till;

    public Filter_DashboardDTO(String from, String till) {
        this.from = from;
        this.till = till;
    }

    public Filter_DashboardDTO() {
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
