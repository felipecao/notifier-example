package com.felipecao.example.web.exceptionhandling;

import com.felipecao.example.ejb.exception.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = EntityNotFoundException.class)
    public void handleEntityNotFoundException(final HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.NOT_FOUND.value(), "ManagedEntity not found");
    }
}
