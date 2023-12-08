package com.algotrader.exchange.integration;

import configuration.AppTestConfiguration;
import lombok.SneakyThrows;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(properties = {
        "spring.liquibase.enabled=false"
})
@AutoConfigureMockMvc
@Import(AppTestConfiguration.class)
public class MvcTests {

    @Autowired
    private MockMvc mvc;

    @Test
    @WithMockUser(authorities = "USER")
    @SneakyThrows
    void fakeEndpointWhenUserAuthorityThenNotFound() {
        this.mvc.perform(get("/fake/endpoint"))
                .andExpect(status().isNotFound());
    }

    @Test
    @SneakyThrows
    @WithMockUser(roles = "ADMIN")
    void usersEndpointWhenUserAuthorityThenNotFound() {
        this.mvc.perform(get("/users/all"))
                .andExpect(status().isOk());
    }
}
