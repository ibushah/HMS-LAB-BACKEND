package com.example.HMSPHARMACY.CONTROLLER;

import com.example.HMSPHARMACY.DTO.DispensaryDTO;
import com.example.HMSPHARMACY.MODEL.Dispensary;
import com.example.HMSPHARMACY.SERVICE.DispensaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/dispensary")
public class DispensaryController {
    @Autowired
    DispensaryService dispensaryService;

    @PostMapping("/")
    public ResponseEntity<String> addDispensary(@RequestBody DispensaryDTO dispensary){

        this.dispensaryService.saveDispensary(dispensary);
        return new ResponseEntity<String>("\"Dispensary saved successfully\"",HttpStatus.OK);

    }

    @GetMapping("/")
    public List<Dispensary> getAllDispensaries()
    {
        return dispensaryService.getDispensaries();
    }

    @GetMapping("/{id}")
    public Dispensary getDispensariesById(@PathVariable ("id") Long id)
    {
        return dispensaryService.getDispensaryById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDispensary(@PathVariable ("id") Long id) {
        return dispensaryService.deleteDispensary(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateDispensary(@PathVariable ("id") Long id, @RequestBody DispensaryDTO dispensary) {
        return dispensaryService.updateDispensary(id, dispensary);
    }

    @PutMapping("/{qty}/sell")
    public ResponseEntity sellDispensary(@PathVariable ("qty") Long quantity, @RequestBody Dispensary dispensary) {
        return dispensaryService.sellDispensary(quantity, dispensary);
    }

    @PutMapping("/active/{id}")
    public ResponseEntity updateStatus(@PathVariable ("id") Long id) {
        return dispensaryService.updateStatus(id);
    }
}
