package com.example.HMSPHARMACY.REPOSITORY;

import com.example.HMSPHARMACY.MODEL.UserTransactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTransactionsRepo extends JpaRepository<UserTransactions,Long> {

    @Query(value = "SELECT SUM(transaction_amount) AS Total FROM user_transactions where (transaction_date between :from and :till) AND (user_id=:id) and (transaction_type='POS')",nativeQuery = true)
    public Double getSalesTotal(@Param("from") String from,@Param("till") String till,@Param("id") Long id);

    @Query(value = "SELECT SUM(transaction_amount) AS Total FROM user_transactions where (transaction_date between :from and :till) AND (user_id=:id) and (transaction_type='GRN')",nativeQuery = true)
    public Double getGrnTotal(@Param("from") String from,@Param("till") String till,@Param("id") Long id);

    public UserTransactions findByRefId(Long id);
//    @Query(value = "SELECT SUM(transaction_amount) AS Total FROM user_transactions where (transaction_by=:email) AND (transaction_date between :from and :till) and (transaction_type='POS')",nativeQuery = true)
//    public Double getSalesTotalByTransactionByAndTransactionType(@Param("email") String email,@Param("from") String from,@Param("till") String till);
//
//    @Query(value = "SELECT SUM(transaction_amount) AS Total FROM user_transactions where (transaction_by=:email) AND (transaction_date between :from and :till) and (transaction_type='GRN')",nativeQuery = true)
//    public Double getGrnTotalByTransactionByAndTransactionType(@Param("email") String email,@Param("from") String from,@Param("till") String till);
}
