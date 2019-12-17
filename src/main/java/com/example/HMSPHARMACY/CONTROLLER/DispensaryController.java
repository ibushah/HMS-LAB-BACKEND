package com.example.HMSPHARMACY.CONTROLLER;

import com.example.HMSPHARMACY.DTO.DispensaryDTO;
import com.example.HMSPHARMACY.MODEL.Dispensary;
import com.example.HMSPHARMACY.SERVICE.DispensaryService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String addDispensary(@RequestBody DispensaryDTO dispensary){

        this.dispensaryService.saveDispensary(dispensary);
        return "Dispensary Saved";

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

    @PatchMapping("/{id}")
    public ResponseEntity updateStatus(@PathVariable ("id") Long id, @RequestBody DispensaryDTO dispensary) {
        return dispensaryService.updateStatus(id, dispensary);
    }
}
