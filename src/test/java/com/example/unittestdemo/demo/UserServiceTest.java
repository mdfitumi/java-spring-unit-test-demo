package com.example.unittestdemo.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
public class UserServiceTest {
    @TestConfiguration
    static class UserServiceImplTestContextConfiguration {
        @Bean
        public UserService userService() {
            return new UserServiceImpl();
        }
    }

    @Autowired
    UserService userService;

    @MockBean
    UserRepository userRepository;

    @Before
    public void setUp() {
        UserEntity user = new UserEntity(1, "Jackson", new Date());

        Mockito.when(userRepository.findUserByName(user.getName()))
                .thenReturn(Optional.of(user));
    }

    @Test
    public void findUserByName_returnUser() {
        assertThat(userService.findUserByName("Jackson").isPresent()).isTrue();
    }

    @Test
    public void findUserByName_returnNull() {
        assertThat(userService.findUserByName("Kate").isEmpty()).isTrue();
    }
}
