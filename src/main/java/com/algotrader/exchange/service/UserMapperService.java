package com.algotrader.exchange.service;

import com.algotrader.exchange.dto.UserDto;
import com.algotrader.exchange.entity.User;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserMapperService {

    public UserDto mapToDto(User user) {

        var grantedAuthority = (user.getRole() != null)
                ? user.getRole().getAuthorities()
                : Collections.emptySet();

        return UserDto.builder()
                .phone(user.getPhone())
                .email(user.getEmail())
                .name(user.getName())
                .gender(user.getGender().name())
                .role((grantedAuthority != null) ? grantedAuthority.toString() : "[]")
                .build();
    }
}
