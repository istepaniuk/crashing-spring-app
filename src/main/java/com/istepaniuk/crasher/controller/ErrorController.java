package com.istepaniuk.crasher.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;

@ControllerAdvice
public class ErrorController extends ResponseEntityExceptionHandler {
    @ExceptionHandler({Exception.class})
    public ResponseEntity<HashMap<String, String>> error(Exception ex, WebRequest request) {
        var body = new HashMap<String, String>();
        var status = HttpStatus.INTERNAL_SERVER_ERROR;
        body.put("message", status.getReasonPhrase());

        return new ResponseEntity<>(body, status);
    }
}
