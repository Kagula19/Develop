package com.example.esunittest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public String setWorking(Long UserId, boolean isWorking){
        Optional<UserEntity> User = userRepository.findById(UserId);
        User.get().setWorking(isWorking);
        return String.valueOf(userRepository.save(User.get()));
    }


}
