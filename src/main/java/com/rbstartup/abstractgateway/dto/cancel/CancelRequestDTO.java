package com.rbstartup.abstractgateway.dto.cancel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CancelRequestDTO {
    private String reference;
    private String amount;
    private String transactionId;
}
