package com.company;

public class SMSMessage implements Message{
    private String body; // = " I am a SMS message.  ";

    public SMSMessage(){}
    public SMSMessage(String body){
        this.body = body;
    }

    public String getBody(){
        return body;
    }

    @Override
    public String prepareMessage() {
        return " I am a SMS message. ";
    }

    @Override
    public String toString(){
        return "SMSMessage{ body='" + body + "'" + '}';
    }



}
