package com.frostmaster.email.service;

import com.frostmaster.email.dto.Email;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

    @Override
    public void sendEmail(Email email) {

    }
}