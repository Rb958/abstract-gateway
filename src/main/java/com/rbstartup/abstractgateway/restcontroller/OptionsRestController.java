package com.rbstartup.abstractgateway.restcontroller;

import com.rbstartup.abstractgateway.dto.options.BasicOptionsResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(BaseURI.OPTIONS)
public interface OptionsRestController {
    @GetMapping
    ResponseEntity<BasicOptionsResponseDTO> getOptions(@RequestParam("reference") String reference);
}
