package com.rbstartup.abstractgateway.dto.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequestDTO {
    private String reference;
    private String amount;
    private String phone;
    private String email;
    private String options;
    private String externalId;
    private String applicationId;
    private String financialId;
}
