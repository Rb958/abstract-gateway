package com.rbstartup.abstractgateway.restcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(BaseURI.REFERENCE_INFO)
public interface ReferenceInfoRestController {
    @GetMapping
    ResponseEntity<?> getReference(@RequestParam("reference") String reference);
}
