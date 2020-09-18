package com.aiwadev.twiliodemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class SmsRequest {

    @NotBlank
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

    @NotBlank
    private String messageBody;

    public String getDestinationNumber() {
        return destinationNumber;
    }

    public String getMessageBody() {
        return messageBody;
    }
}
