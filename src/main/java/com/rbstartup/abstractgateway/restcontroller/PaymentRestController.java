package com.rbstartup.abstractgateway.restcontroller;

import com.rbstartup.abstractgateway.dto.payment.PaymentRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(BaseURI.PAYMENT)
public interface PaymentRestController {

    @PostMapping
    ResponseEntity<?> pay(PaymentRequestDTO requestDTO);
}
