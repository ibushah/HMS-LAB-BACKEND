package com.example.HMSPHARMACY.DTO;

public class FilterUserDetailsDTO {
    public String from;
    public String till;
    public String email;

    public FilterUserDetailsDTO() {
    }

    public FilterUserDetailsDTO(String from, String till, String email) {
        this.from = from;
        this.till = till;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
