package com.example.esunittest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@ActiveProfiles(value = "test")
public class ServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;


    @Test
    void checkSetWorking(){
        UserEntity user = new UserEntity();
        user.setWorking(true);
        user.setSurname("ncesco");
        user.setName("Fra");

        UserEntity userFromDb = userRepository.save(user);
        assertThat(userFromDb.getId()).isNotNull();

        String userFromService = userService.setWorking(user.getId(), false);
        assertThat(!userFromService.isBlank());
    }
}
