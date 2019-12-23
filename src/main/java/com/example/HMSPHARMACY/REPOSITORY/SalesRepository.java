package com.example.HMSPHARMACY.REPOSITORY;

import com.example.HMSPHARMACY.MODEL.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SalesRepository extends JpaRepository<Sales,Long> {

    List<Sales> getById(Long id);

    @Query(value = "SELECT SUM(total_selling_price - (cost_price*product_quantity)) FROM sales",nativeQuery = true)
    public double getProfit();

    @Query(value = "SELECT * FROM sales",nativeQuery = true)
    public List<Sales> getSalesData();

}
