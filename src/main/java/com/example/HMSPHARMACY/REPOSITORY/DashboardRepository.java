package com.example.HMSPHARMACY.REPOSITORY;

import com.example.HMSPHARMACY.MODEL.ProductRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DashboardRepository  extends JpaRepository<ProductRegistration,Long> {

    @Query(value = "SELECT count(pr.id) FROM product_registration pr where createddate between  :from AND :till", nativeQuery = true)
    public double getAllRegisteredProducts(@Param("from") String from, @Param("till") String till);


//    @Query(value = "SELECT sum(unitPrice) from product_registration where createddate between  :from AND :till", nativeQuery = true)
//    public double getAllProductsSum();
//

    @Query(value = "SELECT SUM(max_stock * unit_price) FROM product_registration where createddate between  :from AND :till",nativeQuery = true)
    public Double getTotalProductUnitPrice(@Param("from") String from, @Param("till") String till);

    @Query(value = "SELECT SUM(total_selling_price - (cost_price*product_quantity)) FROM sales where created_at between  :from AND :till",nativeQuery = true)
    public double getSalesProfit(@Param("from") String from, @Param("till") String till);




}


