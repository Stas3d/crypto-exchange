package com.algotrader.exchange.controller;

import com.algotrader.exchange.dto.UserDto;
import com.algotrader.exchange.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping(value = "/find", produces = "application/json")
    @ResponseBody
    public ResponseEntity<UserDto> getUser(@RequestParam("name") String name) {

        var all = service.findOne(name);
        return ResponseEntity.ok()
                .header("Custom-Header", "foo")
                .body(all);
    }

    @GetMapping(value = "all", produces = "application/json")
    public ResponseEntity<List<UserDto>> getUsers() {

        var all = service.findAll();
        return ResponseEntity.ok()
                .header("Custom-Header", "foo")
                .body(all);
    }
}
