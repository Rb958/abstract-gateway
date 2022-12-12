package com.rbstartup.abstractgateway.restcontroller;

import com.rbstartup.abstractgateway.dto.regulate.RegulateRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(BaseURI.REGULATE)
public interface RegulateRestController {

    @PostMapping
    ResponseEntity<?> regulate(RegulateRequestDTO requestDTO);
}
