package com.example.HMSPHARMACY.MODEL;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;




    @OneToOne
    @JoinColumn(name = "productReg_id")
    @JsonBackReference
    ProductRegistration productRegistration;


}
