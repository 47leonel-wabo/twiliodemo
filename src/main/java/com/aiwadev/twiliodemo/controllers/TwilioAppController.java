package com.aiwadev.twiliodemo.controllers;

import com.aiwadev.twiliodemo.model.SmsRequest;
import com.aiwadev.twiliodemo.services.TwilioSmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/sms")
public class TwilioAppController {

    private TwilioSmsSender smsSender;

    @Autowired
    public TwilioAppController(TwilioSmsSender smsSender) {
        this.smsSender = smsSender;
    }

    @PostMapping("/new")
    public void sendAnSms(@Valid @RequestBody SmsRequest smsRequest) {
        smsSender.sendSms(smsRequest);
    }
}
