package com.algotrader.exchange.service;

import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class ValidationService {

    private final static String MAIL_PATTERN = "^(.+)@(\\S+)$";

    public boolean validateEmail(final String emailAddress) {

        return Pattern.compile(MAIL_PATTERN)
                .matcher(emailAddress)
                .matches();
    }
}