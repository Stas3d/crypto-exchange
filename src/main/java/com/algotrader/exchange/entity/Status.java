package com.algotrader.exchange.entity;

import java.util.Arrays;
import java.util.Optional;

public enum Status {

    NEW,
    ACTIVE,
    BANNED,
    BLOCKED;

    public static Optional<Status> find(final String status) {

        return Arrays.stream(values())
                .filter(it -> it.name().equals(status))
                .findFirst();
    }
}
