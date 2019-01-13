package com.frostmaster.email.exception;

import com.frostmaster.email.dto.ErrorDto;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Locale;

@ControllerAdvice
@RequiredArgsConstructor
public class RestExceptionHandler {

    private static final Locale DEFAULT_LOCALE = new Locale("ru", "RU");

    private final MessageSource messageSource;

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorDto> handleRuntimeException(RuntimeException ex) {
        return new ResponseEntity<>(
                new ErrorDto(HttpStatus.INTERNAL_SERVER_ERROR.value(),ex.getMessage()),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<ErrorDto> handleServiceException(ServiceException ex) {
        return new ResponseEntity<>(
                new ErrorDto(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                        messageSource.getMessage(ex.getMessageCode(), ex.getParams(), DEFAULT_LOCALE)),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }
}