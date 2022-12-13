package com.rbstartup.abstractgateway.restcontroller;

import com.rbstartup.abstractgateway.dto.amount.BasicResponseAmountDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(BaseURI.AMOUNT)
public interface AmountRestController {
    @GetMapping
    ResponseEntity<BasicResponseAmountDTO> getAmount(@RequestParam("reference") String reference);

    @ExceptionHandler({ Exception.class })
    public default void handleException() {
        //
    }
}
