package com.example.HMSPHARMACY.CONTROLLER;


import com.example.HMSPHARMACY.DTO.GrnDTO;
import com.example.HMSPHARMACY.DTO.UserTransactionsDTO;
import com.example.HMSPHARMACY.MODEL.Grn;
import com.example.HMSPHARMACY.SERVICE.GrnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/grn")
public class GrnController {
    @Autowired
    GrnService grnService;

    @PostMapping("/post")
    public ResponseEntity<String> postGrn(@RequestBody GrnDTO grnDTO){
        return grnService.postGrn(grnDTO);
    }

    @GetMapping("/getAll")
    public List<Grn> getAllGrn(){
        return grnService.getAllGrn();
    }
    @GetMapping("/{id}")
    public Grn getGrnById(@PathVariable("id") Long id){
        return grnService.getGrnById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteGrn(@PathVariable("id") Long id){
        return grnService.deleteGrn(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateGrn(@PathVariable("id") Long id,@RequestBody GrnDTO grnDTO)
    {return grnService.updateGrn(id,grnDTO);}
}
