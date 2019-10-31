package com.example.HMSPHARMACY.CONTROLLER;

import com.example.HMSPHARMACY.DTO.FilterUserDetailsDTO;
import com.example.HMSPHARMACY.DTO.UserTransactionsDTO;
import com.example.HMSPHARMACY.SERVICE.UserTransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/usertransactions")
public class UserTransactionsController {

    @Autowired
    UserTransactionsService userTransactionsService;

    @PostMapping("/")
    public ResponseEntity<String> saveUserTransactions(@RequestBody UserTransactionsDTO userTransactionsDTO){
        return userTransactionsService.saveUserTransactionsForSales(userTransactionsDTO);
    }

    @PostMapping("/getsalestotal")
    public Double getTotal(@RequestBody FilterUserDetailsDTO filterUserDetailsDTO){
        return userTransactionsService.getSalesTotal(filterUserDetailsDTO);
    }

    @PostMapping("/getgrntotal")
    public Double getGrnTotal(@RequestBody FilterUserDetailsDTO filterUserDetailsDTO){
        return userTransactionsService.getGrnTotal(filterUserDetailsDTO);
    }

//    @PostMapping("/getusersalestotal")
//    public Double getUserSalesTotal(@RequestBody FilterUserDetailsDTO filterUserDetailsDTO){
//        return userTransactionsService.getSalesTotalByEmail(filterUserDetailsDTO);
//    }
//
//    @PostMapping("/getusergrntotal")
//    public Double getUserGrnTotal(@RequestBody FilterUserDetailsDTO filterUserDetailsDTO){
//        return userTransactionsService.getGrnTotalByEmail(filterUserDetailsDTO);
//    }
}
