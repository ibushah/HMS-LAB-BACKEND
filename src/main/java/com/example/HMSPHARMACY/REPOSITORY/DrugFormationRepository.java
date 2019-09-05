package com.example.HMSPHARMACY.REPOSITORY;

import com.example.HMSPHARMACY.MODEL.Company;
import com.example.HMSPHARMACY.MODEL.DrugFormation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DrugFormationRepository extends JpaRepository<DrugFormation,Long> {

    public List<DrugFormation> findByStatus(String status);
}
