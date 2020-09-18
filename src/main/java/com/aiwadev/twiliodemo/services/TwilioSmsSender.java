package com.aiwadev.twiliodemo.services;

import com.aiwadev.twiliodemo.model.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;

public class TwilioSmsSender {
  private SmsSenderImpl smsSender;

  @Autowired
    public TwilioSmsSender(SmsSenderImpl smsSender) {
        this.smsSender = smsSender;
    }

    public void sendSms(SmsRequest request){
      smsSender.sendSms(request);
    }
}
