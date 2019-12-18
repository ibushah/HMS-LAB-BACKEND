package com.example.HMSPHARMACY.REPOSITORY;

import com.example.HMSPHARMACY.MODEL.ProductRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRegistrationRepository extends JpaRepository<ProductRegistration,Long> {
    public List<ProductRegistration> findByStatus(String status);
    public String findByProductName(String productName);

    @Query(value = "SELECT count(id) FROM product_registration",nativeQuery = true)
    public long getAllRegisteredProducts();

    @Query(value = "SELECT SUM(max_stock * unit_price) FROM product_registration",nativeQuery = true)
    public double getTotalUnitPrice();
}
