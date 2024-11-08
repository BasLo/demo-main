package com.demo.main.controller;

import com.demo.main.dto.Response;
import com.demo.main.exception.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@Slf4j
public class AdviceController extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<Response<Void>> handeResourceNotFoundException(ResourceNotFoundException e) {
        return Response.error(e.getMessage(), HttpStatus.NOT_FOUND.value());
    }

}
