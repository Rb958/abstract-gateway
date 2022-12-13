package com.rbstartup.abstractgateway.dto.reference;

import com.rbstartup.abstractgateway.dto.BasicResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class BasicReferenceOptionsResponseDTO<T, E> extends BasicResponseDTO<T> {
    private List<E> options;
}
