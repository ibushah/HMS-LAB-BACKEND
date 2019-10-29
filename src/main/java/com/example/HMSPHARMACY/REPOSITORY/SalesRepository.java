package com.example.HMSPHARMACY.REPOSITORY;

import com.example.HMSPHARMACY.MODEL.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface
SalesRepository extends JpaRepository<Sales,Long> {
    @Query(value = "select SUM(product_price) from sales where created_at between :from and :till order by created_at",nativeQuery = true)
    public Double getSalesTotalByDate(@Param("from") String from,@Param("till") String till);

}
