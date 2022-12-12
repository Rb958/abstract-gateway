package com.rbstartup.abstractgateway.dto.status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusRequestDTO {
    private String reference;
    private int amount;
    private String providerId;
    private String transactionId;
    private String financialId;
    private String externalId;
    private String requestId;
    private String applicationId;
}
