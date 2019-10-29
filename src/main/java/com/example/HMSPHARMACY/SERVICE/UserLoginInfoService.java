package com.example.HMSPHARMACY.SERVICE;

import com.example.HMSPHARMACY.DTO.UserLoginInfoDTO;
import com.example.HMSPHARMACY.MODEL.UserLoginInfo;
import com.example.HMSPHARMACY.REPOSITORY.UserLoginInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLoginInfoService {

    @Autowired
    UserLoginInfoRepository userLoginInfoRepository;

    public ResponseEntity<String> saveUserLoginInfo(UserLoginInfoDTO userLoginInfoDTO){

        UserLoginInfo user1 = userLoginInfoRepository.findByEmail(userLoginInfoDTO.getEmail());
        if(user1==null) {
            UserLoginInfo userLoginInfo = new UserLoginInfo();

            userLoginInfo.setUsername(userLoginInfoDTO.getUsername());
            userLoginInfo.setEmail(userLoginInfoDTO.getEmail());
            userLoginInfoRepository.save(userLoginInfo);

            return new ResponseEntity<String>("\"userLoginInfo successfully saved\"", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<String>("\"userLoginInfo Already Exist\"", HttpStatus.OK);
        }
    }

   public UserLoginInfo getUserByEmail(String email){
        UserLoginInfo userLoginInfo = userLoginInfoRepository.findByEmail(email);
        return  userLoginInfo;
   }

   public List<UserLoginInfo> getUsers(){
       List<UserLoginInfo> userLoginInfos = userLoginInfoRepository.findAll();
       return userLoginInfos;
   }
}
