package com.rbstartup.abstractgateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicListResponseDTO<T> {
    private String message;
    private String code;
    private List<T> result;
}
