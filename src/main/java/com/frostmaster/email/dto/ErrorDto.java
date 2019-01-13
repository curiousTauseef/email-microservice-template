package com.frostmaster.email.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorDto {
    private int status;
    private String message;
}