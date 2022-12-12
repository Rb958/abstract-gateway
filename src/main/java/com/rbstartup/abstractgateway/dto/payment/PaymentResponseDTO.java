package com.rbstartup.abstractgateway.dto.payment;

import com.rbstartup.abstractgateway.dto.BasicResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponseDTO extends BasicResponseDTO<Object> {
    private String providerId;
    private String transactionId;
    private String externalId;
    private String financialId;
    private String applicationId;
    private String requestId;
}
