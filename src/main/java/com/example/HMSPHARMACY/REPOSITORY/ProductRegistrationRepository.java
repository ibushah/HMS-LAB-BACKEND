package com.example.HMSPHARMACY.REPOSITORY;

import com.example.HMSPHARMACY.MODEL.ProductRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRegistrationRepository extends JpaRepository<ProductRegistration,Long> {
    public List<ProductRegistration> findByStatus(String status);
    public String findByProductName(String productName);
}
