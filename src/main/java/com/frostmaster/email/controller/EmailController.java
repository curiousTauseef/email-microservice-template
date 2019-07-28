package com.frostmaster.email.controller;

import com.frostmaster.email.entity.Email;
import com.frostmaster.email.service.EmailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@Api(value = "/email")
@RequestMapping("/email")
public class EmailController {

    @Autowired
    EmailService emailService;

    @ApiOperation(value = "Send an email", response = ResponseEntity.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 500, message = "Something went wrong")
    })
    @PostMapping(
            value = "/sendEmail"
    )
    public void sendEmail(@RequestBody Email email) {
        emailService.sendEmail(email);
    }
}