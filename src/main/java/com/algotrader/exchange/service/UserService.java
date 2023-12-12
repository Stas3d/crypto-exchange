package com.algotrader.exchange.service;

import com.algotrader.exchange.dto.UserDto;
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
