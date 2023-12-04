package com.algotrader.exchange.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping(value = "/all", produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> getAll() {

        return ResponseEntity.ok()
                .header("Custom-Header", "all-access")
                .body("all-access-here");
    }

    @GetMapping(value = "/admin", produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> getAdmin() {

        return ResponseEntity.ok()
                .header("Custom-Header", "admin-access")
                .body("admin-access-here");
    }

    @GetMapping(value = "/super-admin", produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> getSuperAdmin() {

        return ResponseEntity.ok()
                .header("Custom-Header", "super-admin-access")
                .body("super-admin-access-here");
    }
}
