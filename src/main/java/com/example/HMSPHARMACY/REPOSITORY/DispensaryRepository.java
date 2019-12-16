package com.example.HMSPHARMACY.REPOSITORY;


import com.example.HMSPHARMACY.MODEL.Dispensary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DispensaryRepository extends JpaRepository<Dispensary,Long> {

    public String findByName(String dispensaryName);
    public Long findByStock(String dispensaryName);
    public List<Dispensary> findByStatus(String status);
}
