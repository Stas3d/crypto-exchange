package com.algotrader.exchange.repository;

import com.algotrader.exchange.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();

    List<User> findByName(String name);
}
