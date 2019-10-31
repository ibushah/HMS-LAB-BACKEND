package com.example.HMSPHARMACY.SERVICE;

import com.example.HMSPHARMACY.DTO.*;
import com.example.HMSPHARMACY.MODEL.BulkSave;
import com.example.HMSPHARMACY.MODEL.UserLoginInfo;
import com.example.HMSPHARMACY.MODEL.UserTransactions;
import com.example.HMSPHARMACY.REPOSITORY.UserLoginInfoRepository;
import com.example.HMSPHARMACY.REPOSITORY.UserTransactionsRepo;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserTransactionsService {

    @Autowired
    UserTransactionsRepo userTransactionsRepo;

    @Autowired
    UserLoginInfoRepository userLoginInfoRepository;

    public ResponseEntity<String> saveUserTransactionsForGrn(GrnDTO grnDTO, Long id){

        UserTransactions userTransactions = new UserTransactions();

        userTransactions.setTransactionAmount(grnDTO.getTransactionAmount());
        userTransactions.setTransactionDate(new Date());
        userTransactions.setUserLoginInfo(grnDTO.getUserLoginInfo());
        userTransactions.setTransactionBy(grnDTO.getUserLoginInfo().getEmail());
        userTransactions.setTransactionType(grnDTO.getTransactionType());
        userTransactions.setRefId(id);
        userTransactionsRepo.save(userTransactions);

        return new ResponseEntity<String>("\"UserTransactions successfully saved\"", HttpStatus.OK);

    }

    public ResponseEntity<String> saveUserTransactionsForSales(UserTransactionsDTO userTransactionsDTO){

        UserTransactions userTransactions = new UserTransactions();

        userTransactions.setTransactionAmount(userTransactionsDTO.getTransactionAmount());
        userTransactions.setTransactionDate(new Date());
        userTransactions.setUserLoginInfo(userTransactionsDTO.getUserLoginInfo());
        userTransactions.setTransactionBy(userTransactionsDTO.getUserLoginInfo().getEmail());
        userTransactions.setTransactionType(userTransactionsDTO.getTransactionType());
        userTransactionsRepo.save(userTransactions);

        return new ResponseEntity<String>("\"UserTransactions successfully saved\"", HttpStatus.OK);

    }

    public Double getSalesTotal(FilterUserDetailsDTO filterUserDetailsDTO){

        UserLoginInfo userLoginInfo = userLoginInfoRepository.findByEmail(filterUserDetailsDTO.getEmail());
        if(userLoginInfo !=null) {
            Double total = 0.0;
            total = userTransactionsRepo.getSalesTotal(filterUserDetailsDTO.getFrom(), filterUserDetailsDTO.getTill(), userLoginInfo.getId());
            return total;
        }
        return null;
    }


    public Double getGrnTotal(FilterUserDetailsDTO filterUserDetailsDTO){

        UserLoginInfo userLoginInfo = userLoginInfoRepository.findByEmail(filterUserDetailsDTO.getEmail());
        if(userLoginInfo !=null) {
            Double total = 0.0;
            total = userTransactionsRepo.getGrnTotal(filterUserDetailsDTO.getFrom(), filterUserDetailsDTO.getTill(), userLoginInfo.getId());
            return total;
        }
        return null;
    }

//    public Double getSalesTotalByEmail(FilterUserDetailsDTO filterUserDetailsDTO){
//        Double total = 0.0;
//        total = userTransactionsRepo.getSalesTotalByTransactionByAndTransactionType(filterUserDetailsDTO.getEmail(),filterUserDetailsDTO.getFrom(),filterUserDetailsDTO.getTill());
//        return total;
//    }
//
//    public Double getGrnTotalByEmail(FilterUserDetailsDTO filterUserDetailsDTO){
//        Double total = 0.0;
//        total = userTransactionsRepo.getGrnTotalByTransactionByAndTransactionType(filterUserDetailsDTO.getEmail(),filterUserDetailsDTO.getFrom(),filterUserDetailsDTO.getTill());
//        return total;
//    }

}
