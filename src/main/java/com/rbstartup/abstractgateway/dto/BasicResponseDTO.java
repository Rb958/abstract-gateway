package com.rbstartup.abstractgateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicResponseDTO<T> {
    private String message;
    private String code;
    private T result;
}
