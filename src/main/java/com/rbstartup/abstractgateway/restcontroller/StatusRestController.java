package com.rbstartup.abstractgateway.restcontroller;

import com.rbstartup.abstractgateway.dto.payment.PaymentResponseDTO;
import com.rbstartup.abstractgateway.dto.status.StatusRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(BaseURI.STATUS)
public interface StatusRestController {
    @PostMapping
    ResponseEntity<PaymentResponseDTO> getStatus(StatusRequestDTO statusRequestDTO);
}
