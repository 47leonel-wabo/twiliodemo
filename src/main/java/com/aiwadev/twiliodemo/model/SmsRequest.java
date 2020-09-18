package com.aiwadev.twiliodemo.model;

public class SmsRequest {

    private String destinationNumber;

    public SmsRequest(String destinationNumber, String messageBody) {
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
