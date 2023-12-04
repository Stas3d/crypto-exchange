package com.algotrader.exchange.service;

import com.algotrader.exchange.dto.UserDto;
import com.algotrader.exchange.entity.User;
import com.algotrader.exchange.exception.NoUserException;
import com.algotrader.exchange.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository repository;

    private final UserMapperService mapper;

    @PostConstruct
    void fillDefaultUsers() {

        repository.save(new User("Bobby", "bobby@domain.com", "067", "MALE", "ADMIN",
                "$2a$12$iCPLIIlvE2sH5WgFxhGuT.mOgUK.8teEkAcNLsM6wMXW4XQnHDojq"));
        repository.save(new User("Kolya", "kolya@domain.com", "068", null, null,
                "$2a$12$ajuIIpJsHprUWvZGP2Pqv.z1Kb7ADWIjftgxfV5WrphR4RwA1Ctvq"));
        repository.save(new User("Lenny", "lenny@domain.com", "069", "MALE", "ADMIN",
                "$2a$12$Vho6LPf2iC.0BqaLatmq1.oBvg6UsWOe6i5SZyy85/v.jCbDSF4tC"));
        repository.save(new User("thomas", "thomas@domain.com", "060", "MALE", "ADMIN",
                "$2a$10$6fJaLKwQ3sHsuv.PT8h6CO/zx9wspxY9cr4yZXFykQq3.9KeeM9cK"));

    }

    public UserDto findOne(String name) {

        return repository.findByName(name)
                .stream()
                .filter(Objects::nonNull)
                .map(mapper::mapToDto)
                .findAny().orElseThrow(NoUserException::new);
    }

    public List<UserDto> findAll() {

        return repository.findAll()
                .stream()
                .filter(Objects::nonNull)
                .map(mapper::mapToDto)
                .collect(Collectors.toList());
    }
}
