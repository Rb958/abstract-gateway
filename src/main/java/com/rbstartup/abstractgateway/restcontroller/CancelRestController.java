package com.rbstartup.abstractgateway.restcontroller;

import com.rbstartup.abstractgateway.dto.cancel.CancelRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(BaseURI.CANCEL)
public interface CancelRestController {

    @PostMapping
    ResponseEntity<Object> cancel(CancelRequestDTO requestDTO);
}
