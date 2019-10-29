package com.example.HMSPHARMACY.REPOSITORY;

import com.example.HMSPHARMACY.MODEL.UserLoginInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginInfoRepository extends JpaRepository<UserLoginInfo,Long> {

    public UserLoginInfo findByEmail(String email);
}
