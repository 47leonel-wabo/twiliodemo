package com.aiwadev.twiliodemo.services;

import com.aiwadev.twiliodemo.model.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TwilioSmsSender {
  private SmsSender smsSender;

  @Autowired
    public TwilioSmsSender(@Qualifier("twilio") SmsSenderImpl smsSender) {
        this.smsSender = smsSender;
    }

    public void sendSms(SmsRequest request){
      smsSender.sendSms(request);
    }
}
