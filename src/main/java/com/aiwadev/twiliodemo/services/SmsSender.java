package com.aiwadev.twiliodemo.services;

import com.aiwadev.twiliodemo.model.SmsRequest;

public interface SmsSender {

    public void sendSms(SmsRequest smsRequest);

}
