package com.example.unittestdemo.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
public class UserServiceDeleteTest {
    @TestConfiguration
    static class UserServiceDeleteTestContextConfiguration {
        @Bean
        public UserService userService() {
            return new UserServiceImpl();
        }
    }

    @Autowired
    UserService userService;

    @MockBean
    UserRepository userRepository;

    @Test
    public void deleteUserByName() {
        userService.deleteUser(1);
        Mockito.verify(userRepository).deleteById(Mockito.anyInt());
    }
}
