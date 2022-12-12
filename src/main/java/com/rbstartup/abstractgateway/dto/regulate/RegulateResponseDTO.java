package com.rbstartup.abstractgateway.dto.regulate;

import com.rbstartup.abstractgateway.dto.BasicResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegulateResponseDTO extends BasicResponseDTO<Object> {
    private String providerId;
    private String transactionId;
    private String financialId;
    private String externalId;
    private String requestId;
    private String applicationId;
}
