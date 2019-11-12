package com.company;

public class EmailMessage implements Message{
    private String body; // = " I am @ email message. ";

    public EmailMessage(){
    }
    public EmailMessage(String body){
        this.body = body;
    }
    public String getBody(){
        return body;
    }
    @Override
    public String prepareMessage(){
        return " I am @ email message. ";
    }

    @Override
    public String toString() {
        return "EmailMessage{ body='" + body + '}';
    }
}
