package com.example.HMSPHARMACY.SERVICE;

import com.example.HMSPHARMACY.DTO.DrugFormationDTO;
import com.example.HMSPHARMACY.MODEL.DrugFormation;
import com.example.HMSPHARMACY.REPOSITORY.DrugFormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugFormationService {

    @Autowired
    DrugFormationRepository drugFormationRepository;

    public ResponseEntity<String> postDrugFormation(DrugFormationDTO drugFormationDTO){
        DrugFormation drugFormation=new DrugFormation();
        drugFormation.setStatus("Active");
        drugFormation.setName(drugFormationDTO.getName());
        drugFormationRepository.save(drugFormation);
        return new ResponseEntity<String>("\"Drug formation  successfully saved\"", HttpStatus.OK);
    }

    public List<DrugFormation> getDrugFormation(){
        List<DrugFormation> drugFormation=drugFormationRepository.findByStatus("Active");
        return drugFormation;

    }
    public ResponseEntity<String> deleteDrugFormation(Long id){

        DrugFormation drugFormation=drugFormationRepository.getOne(id);
        drugFormation.setStatus("InActive");
        drugFormationRepository.save(drugFormation);
    return new ResponseEntity<String>("\"Drug formation  deleted successfully\"", HttpStatus.OK);

}

}
