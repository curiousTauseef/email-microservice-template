package com.frostmaster.email.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ServiceException extends RuntimeException {

    private final String messageCode;
    private final Object[] params;

    public ServiceException(String messageCode, Object... params) {
        super(messageCode);
        this.messageCode = messageCode;
        this.params = params.clone();
    }

    public ServiceException(String messageKey) {
        this(messageKey, new Object[]{});
    }
}