package com.aiwadev.twiliodemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmsRequest {

    private String destinationNumber;

    public SmsRequest(@JsonProperty("destination") String destinationNumber,
                      @JsonProperty("message") String messageBody) {
        this.destinationNumber = destinationNumber;
        this.messageBody = messageBody;
    }

    @Override
    public String toString() {
        return "SmsRequest{" +
                "destinationNumber='" + destinationNumber + '\'' +
                ", messageBody='" + messageBody + '\'' +
                '}';
    }

    private String messageBody;

    public String getDestinationNumber() {
        return destinationNumber;
    }

    public String getMessageBody() {
        return messageBody;
    }
}
