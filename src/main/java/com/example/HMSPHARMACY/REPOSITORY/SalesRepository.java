package com.example.HMSPHARMACY.REPOSITORY;

import com.example.HMSPHARMACY.MODEL.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SalesRepository extends JpaRepository<Sales,Long> {

    @Query(value = "SELECT SUM(total_selling_price - (cost_price*product_quantity)) FROM sales",nativeQuery = true)
    public double getProfit();
}
