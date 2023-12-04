package com.algotrader.exchange.handler;

import com.algotrader.exchange.dto.BaseErrorDetailsDto;
import com.algotrader.exchange.dto.BaseErrorResponseDto;
import com.algotrader.exchange.exception.NoUserException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.List;


@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(NoUserException.class)
    protected ResponseEntity<BaseErrorResponseDto> handleNoUserException(NoUserException ex) {

        var details = BaseErrorDetailsDto.builder().name("reason").reason("no-user-found").build();
        var responseDto = buildBaseErrorResponseDto("NO_USER_FOUND", "title", List.of(details));
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .contentType(MediaType.APPLICATION_JSON)
                .body(responseDto);
    }

    private BaseErrorResponseDto buildBaseErrorResponseDto(String type,
                                                           String title,
                                                           List<BaseErrorDetailsDto> details) {
        return BaseErrorResponseDto.builder()
                .type(type)
                .title(title)
                .details(details)
                .build();
    }
}
