package com.rbstartup.abstractgateway.dto.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequestDTO {
    private String reference;
    private String amount;
    private String phone;
    private String email;
    private String options;
    private String externalId;
    private String applicationId;
    private String financialId;
    private int limit;
    private int offset;
    private String mode;
}
