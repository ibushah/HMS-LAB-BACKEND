package com.example.HMSPHARMACY.REPOSITORY;

import com.example.HMSPHARMACY.MODEL.BulkSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BulkSaveRepository extends JpaRepository<BulkSave,Long>{


    @Query(value = "select * from bulk_save where created_at between :from and :till order by created_at",nativeQuery = true)
    public List<BulkSave> getBulkSaveByCreatedAt(@Param("from") String from,@Param("till") String till);
}
