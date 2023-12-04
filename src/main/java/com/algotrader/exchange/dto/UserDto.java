package com.algotrader.exchange.dto;

import lombok.*;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String name;
    private String email;
    private String phone;
    private String gender;
    private String role;
}
