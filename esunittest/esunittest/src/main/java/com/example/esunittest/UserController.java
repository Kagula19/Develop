package com.example.esunittest;


import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;




    @PostMapping("/user")
    public @ResponseBody UserEntity NewUser(@RequestBody UserEntity user){
        return userRepository.save(user);
    }

    @GetMapping("/getList")
    public @ResponseBody List<UserEntity> getList(){
        return userRepository.findAll();
    }

    @GetMapping("/getUser{id}")
    public @ResponseBody UserEntity getUser(@PathVariable Long id){
        Optional<UserEntity> user = userRepository.findById(id);
        if (user.isPresent()){
            return user.get();
        } else {
            return null;
        }
    }

    @PutMapping("/updateKey{id}")
    public void updateKey(@PathVariable Long id, @RequestBody @NotNull UserEntity user){
        user.setId(id);
        userRepository.save(user);

    }

    @PutMapping("/updateWorking{id}")
    public void updateWorking(@PathVariable Long id, @PathVariable boolean isWorking){
        userService.setWorking(id, isWorking);
    }

    @DeleteMapping("/delete{id}")
    public void delete(@PathVariable Long id){
        userRepository.deleteById(id);
    }


}
