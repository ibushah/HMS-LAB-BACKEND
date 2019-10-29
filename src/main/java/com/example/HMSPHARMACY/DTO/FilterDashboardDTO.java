package com.example.HMSPHARMACY.DTO;

public class FilterDashboardDTO {

    public String from;
    public String till;

    public FilterDashboardDTO(String from, String till) {
        this.from = from;
        this.till = till;
    }

    public FilterDashboardDTO() {
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
