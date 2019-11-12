package com.company;

public class MessageProcessor {
    public void prepareMessage(Message message){
        message.prepareMessage();
        System.out.println(message.getBody());
    }
}
