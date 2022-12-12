package com.rbstartup.abstractgateway.restcontroller;

import com.rbstartup.abstractgateway.dto.transaction.TransactionRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(BaseURI.TRANSACTION)
public interface TransactionRestController {

    @PostMapping
    ResponseEntity<?> getTransaction(TransactionRequestDTO requestDTO);
}
