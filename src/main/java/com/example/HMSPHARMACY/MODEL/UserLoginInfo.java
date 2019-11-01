package com.example.HMSPHARMACY.MODEL;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserLoginInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String username;
    String email;

    @OneToMany(mappedBy = "userLoginInfo")
    @JsonIgnore
    List<UserTransactions> userTransactions;


    public UserLoginInfo() {
    }

    public UserLoginInfo(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<UserTransactions> getUserTransactions() {
        return userTransactions;
    }

    public void setUserTransactions(List<UserTransactions> userTransactions) {
        this.userTransactions = userTransactions;
    }
}
