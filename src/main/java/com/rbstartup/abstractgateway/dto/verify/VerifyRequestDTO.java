package com.rbstartup.abstractgateway.dto.verify;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VerifyRequestDTO {
    private String reference;
    private int amount;
    private String phone;
    private String email;
    private String option;
}
