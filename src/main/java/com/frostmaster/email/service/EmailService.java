package com.frostmaster.email.service;

import com.frostmaster.email.entity.Email;


public interface EmailService {

    boolean sendEmail(Email email);

}