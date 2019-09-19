package com.example.HMSPHARMACY.CONTROLLER;

import com.example.HMSPHARMACY.DTO.DrugFormationDTO;
import com.example.HMSPHARMACY.MODEL.DrugFormation;
import com.example.HMSPHARMACY.SERVICE.DrugFormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/drugFormation")
public class DrugFormationController {
    @Autowired
    DrugFormationService drugFormationService;


    @PostMapping("/post")
    public ResponseEntity<String> postDrugFormation(@RequestBody DrugFormationDTO drugFormationDTO){
        return drugFormationService.postDrugFormation(drugFormationDTO);
    }

    @GetMapping("/getAll")
    public List<DrugFormation> getAllDrugFormation(){
        return drugFormationService.getDrugFormation();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDrugFormation(@PathVariable ("id") Long id){
        return drugFormationService.deleteDrugFormation(id);
    }

}
