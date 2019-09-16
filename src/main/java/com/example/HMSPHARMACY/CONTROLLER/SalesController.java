package com.example.HMSPHARMACY.CONTROLLER;

import com.example.HMSPHARMACY.DTO.SalesDTO;
import com.example.HMSPHARMACY.SERVICE.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/sales")
public class SalesController {


    @Autowired
    SalesService salesService;

    @PostMapping("/post")
    public ResponseEntity<String> saveSales(@RequestBody List<SalesDTO> salesDTO) {
        return salesService.saveSales(salesDTO);
    }

}