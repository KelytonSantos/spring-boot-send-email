package com.ms.springbootsendemail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.springbootsendemail.model.EmailModel;
import com.ms.springbootsendemail.repository.EmailRepository;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    public void sendEmail(EmailModel emailModel) {
        
    }



}