package com.example.HMSPHARMACY.REPOSITORY;

import com.example.HMSPHARMACY.MODEL.DrugFormation;
import com.example.HMSPHARMACY.MODEL.Grn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GrnRepository extends JpaRepository<Grn,Long> {
    public List<Grn> findByStatus(String status);
}
