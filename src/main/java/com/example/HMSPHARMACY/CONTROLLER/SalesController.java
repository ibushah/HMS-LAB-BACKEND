package com.example.HMSPHARMACY.CONTROLLER;

import com.example.HMSPHARMACY.DTO.FilterSalesByDateDTO;
import com.example.HMSPHARMACY.DTO.SalesDTO;
import com.example.HMSPHARMACY.MODEL.BulkSave;
import com.example.HMSPHARMACY.MODEL.ProductRegistration;
import com.example.HMSPHARMACY.SERVICE.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/get")
    public List<BulkSave> getBulkSaveData(){
        return salesService.getBulkSaveData();
    }

    @PostMapping("/getfilteredsales")
    public List<BulkSave> getFilteredSales(@RequestBody FilterSalesByDateDTO filterSalesByDateDTO){

            return salesService.getBulkSalesDataByDate(filterSalesByDateDTO);

    }

    @GetMapping("/product/{id}")
    public ProductRegistration getProductById(@PathVariable("id") Long id)
    {return salesService.getProductById(id);}
}