package com.algotrader.exchange.integration;

import com.algotrader.exchange.entity.User;
import com.algotrader.exchange.repository.UserRepository;
import configuration.AppTestConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest(properties = {
        "spring.liquibase.enabled=false"
})
@Import(AppTestConfiguration.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void whenCalledSave_thenCorrectNumberOfUsers() {
        userRepository.save(new User("Bob", "bob@domain.com", null, "MALE", "ADMIN", "pwd"));
        userRepository.save(new User("Nic", "nic@domain.com", null, null, "MALE", "pwd"));
        var users = (List<User>) userRepository.findAll();
        assertEquals(users.size(), 2);
    }

    @Test
    public void testFindMethod() {
        userRepository.save(new User("Nic", "nic@domain.com", "+380671234567", "MALE", "DOG",
                "123"));
        var test = userRepository.findByName("Nic");
        assertEquals(test.size(), 1);
    }
}
