package com.example.HMSPHARMACY.REPOSITORY;

import com.example.HMSPHARMACY.MODEL.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
