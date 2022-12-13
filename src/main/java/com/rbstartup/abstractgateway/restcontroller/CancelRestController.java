package com.rbstartup.abstractgateway.restcontroller;

import com.rbstartup.abstractgateway.dto.cancel.CancelRequestDTO;
import com.rbstartup.abstractgateway.dto.payment.PaymentResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(BaseURI.CANCEL)
public interface CancelRestController {

    @PostMapping
    ResponseEntity<PaymentResponseDTO> cancel(CancelRequestDTO requestDTO);
}
