package com.rbstartup.abstractgateway.restcontroller;

import com.rbstartup.abstractgateway.dto.verify.VerifyRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(BaseURI.VERIFY)
public interface CheckRestController {
    @PostMapping
    ResponseEntity<?> verify(VerifyRequestDTO requestDTO);
}
