package com.algotrader.exchange.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseErrorDetailsDto {

    private String name;
    private String reason;
}
