package com.company;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MessageConvertor messageConvertor = new MessageConvertor();
        MessageProcessor messageProcessor = new MessageProcessor();

        JsonMessage jsonMessage = new JsonMessage("This is body of jsonMessage!");
        messageProcessor.prepareMessage(jsonMessage);
        System.out.println("Converted message: " + messageConvertor.convertMessage(jsonMessage));

        XmlMessage xmlMessage = new XmlMessage("This is body of xmlMessage!");
        messageProcessor.prepareMessage(xmlMessage);
        System.out.println("Converted message: " + messageConvertor.convertMessage(xmlMessage));

        EmailMessage emailMessage = new EmailMessage("This is body of emailMessage!");
        messageProcessor.prepareMessage(emailMessage);
        System.out.println("Converted message: " + messageConvertor.convertMessage(emailMessage));

        SMSMessage smsMessage = new SMSMessage("This is body of SMS Message!");
        messageProcessor.prepareMessage(smsMessage);
        System.out.println("Converted message: " + messageConvertor.convertMessage(smsMessage));








    }
}
