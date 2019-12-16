package com.example.HMSPHARMACY.REPOSITORY;

import com.example.HMSPHARMACY.MODEL.ProductRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRegistrationRepository extends JpaRepository<ProductRegistration,Long> {
    public List<ProductRegistration> findByStatus(String status);
    public String findByProductName(String productName);

    @Query(value = "SELECT count(id) FROM ProductRegistration")
    public double getAllRegisteredProducts();
}
