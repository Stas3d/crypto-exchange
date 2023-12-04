package com.algotrader.exchange.dto;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailConfirmationDto {

    private String email;
    private String confirmationCode;
}
