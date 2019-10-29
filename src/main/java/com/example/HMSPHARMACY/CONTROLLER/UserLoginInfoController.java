package com.example.HMSPHARMACY.CONTROLLER;

import com.example.HMSPHARMACY.DTO.UserLoginInfoDTO;
import com.example.HMSPHARMACY.MODEL.UserLoginInfo;
import com.example.HMSPHARMACY.SERVICE.UserLoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/userlogininfo")
public class UserLoginInfoController {

    @Autowired
    UserLoginInfoService userLoginInfoService;

    @PostMapping("/")
    public ResponseEntity<String> saveUserLoginInfo(@RequestBody UserLoginInfoDTO userLoginInfoDTO){

        return userLoginInfoService.saveUserLoginInfo(userLoginInfoDTO);
    }

    @GetMapping("/getuser/{email}")
    public UserLoginInfo getUserByEmail(@PathVariable("email") String email){
        return userLoginInfoService.getUserByEmail(email);
    }

    @GetMapping("/getusers")
    public List<UserLoginInfo> getUsers(){
        return userLoginInfoService.getUsers();
    }
}
