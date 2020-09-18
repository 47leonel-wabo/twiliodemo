package com.aiwadev.twiliodemo.services;

import com.aiwadev.twiliodemo.configs.TwilioConfiguration;
import com.aiwadev.twiliodemo.model.SmsRequest;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("twilio")
public class SmsSenderImpl implements SmsSender {

    private final static Logger LOGGER = LoggerFactory.getLogger(SmsSender.class);

    @Autowired
    public SmsSenderImpl(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
    }

    private final TwilioConfiguration twilioConfiguration;

    @Override
    public void sendSms(SmsRequest smsRequest) {
        if (isValidPhoneNumber(smsRequest.getDestinationNumber())) {
            PhoneNumber to = new PhoneNumber(smsRequest.getDestinationNumber());
            PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
            String messageBody = smsRequest.getMessageBody();

            MessageCreator messageCreator = Message.creator(to, from, messageBody);
            messageCreator.create();
            LOGGER.info("Message sends to" + smsRequest.getDestinationNumber());
        } else {
            throw new IllegalArgumentException("[ " +
                    smsRequest.getDestinationNumber() + "] is not a valid phone number!");
        }
    }

    private boolean isValidPhoneNumber(String destinationNumber) {
        // TODO: Implement phone number validation
        // TODO: Find library for validate phone number
        return true;
    }
}
