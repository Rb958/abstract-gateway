package com.rbstartup.abstractgateway.dto.regulate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegulateRequestDTO {
    private String reference;
    private String amount;
    private String transactionId;
}
