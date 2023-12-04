package com.algotrader.exchange.entity;

import java.util.Arrays;
import java.util.Optional;

public enum Gender {

    MALE,
    FEMALE,
    OTHER;

    public static Optional<Gender> find(final String gender) {

        return Arrays.stream(values())
                .filter(it -> it.name().equals(gender))
                .findFirst();
    }
}
