package com.example.HMSPHARMACY.SERVICE;

import com.example.HMSPHARMACY.DTO.DispensaryDTO;
import com.example.HMSPHARMACY.MODEL.Dispensary;
import com.example.HMSPHARMACY.REPOSITORY.DispensaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DispensaryService {

    @Autowired
    DispensaryRepository dispensaryRepository;

    public String saveDispensary(DispensaryDTO dispensary) {

        if(dispensary.getName() == null){
            return "Name not Entered";
        }

        Dispensary dispensary1 = new Dispensary();
        dispensary1.setName(dispensary.getName());
        dispensary1.setStock(dispensary.getStock());
        dispensary1.setPrice(dispensary.getPrice());
        dispensary1.setStatus("ACTIVE");
        dispensaryRepository.save(dispensary1);
        return "Dispensary Saved Successfully";
    }

    public List<Dispensary> getDispensaries()
    {
        List<Dispensary> dispensary = dispensaryRepository.findAll();
        return dispensary;

    }

    public Dispensary getDispensaryById(Long id){
        Optional<Dispensary> dispensary = dispensaryRepository.findById(id);
        return dispensary.get();
    }

    public ResponseEntity<String> updateDispensary(Long id, DispensaryDTO dispensary){


        Optional<Dispensary> dispensary1 = dispensaryRepository.findById(id);
        if(dispensary1.isPresent()){
            Dispensary dispensary2 = dispensary1.get();

            dispensary2.setName(dispensary.getName());
            dispensary2.setStock(dispensary.getStock());
            dispensary2.setPrice(dispensary.getPrice());
            dispensary2.setStatus(dispensary.getStatus());
            dispensaryRepository.save(dispensary2);
            return new ResponseEntity<>("\"Dispensary Updated successfully\"", HttpStatus.OK);
        }

        else {
            return new ResponseEntity<>("\"Dispensary Not found\"", HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<String> updateStatus(Long id){


        Optional<Dispensary> dispensary1 = dispensaryRepository.findById(id);
        if(dispensary1.isPresent()){
            Dispensary dispensarydata = dispensary1.get();
            dispensarydata.setStatus("ACTIVE");
            dispensaryRepository.save(dispensarydata);
            return new ResponseEntity<>("\"Dispensary Updated successfully\"", HttpStatus.OK);
        }

        else {
            return new ResponseEntity<>("\"Dispensary Not found\"", HttpStatus.NOT_FOUND);
        }
    }


    public ResponseEntity<String>  deleteDispensary(Long id) {

        Dispensary dispensary = dispensaryRepository.findById(id).get();
        if (dispensary != null) {
            dispensary.setStatus("INACTIVE");
            dispensaryRepository.save(dispensary);

            return new ResponseEntity<String>("\"Dispensary deleted successfully\"", HttpStatus.OK);
        } else {

            return new ResponseEntity<String>("\"Dispensary not found \"", HttpStatus.NOT_FOUND);
        }

    }

    public ResponseEntity<String> sellDispensary(Long quantity,  Dispensary dispensary){

        if(dispensary.getId() == null ){
            return new ResponseEntity<>("\"Dispensary Not found\"", HttpStatus.NOT_FOUND);
        }

        Long stock = dispensary.getStock() - quantity;

        if(stock > 0 && dispensary.getId() != null)  {
            dispensary.setStock(dispensary.getStock() - quantity);

            dispensaryRepository.save(dispensary);
            return new ResponseEntity<>("\"Dispensary Sold successfully\"", HttpStatus.OK);
        }

        else {
            return new ResponseEntity<>("\"Dispensary Out of Stock\"", HttpStatus.NOT_FOUND);
        }
    }

}
