package com.algotrader.exchange.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserDto {

    private String name;
    private String email;
    private String secondaryEmail;
    private String password;
    private String passwordConfirmation;
    private String phone;
    private String gender;
}
