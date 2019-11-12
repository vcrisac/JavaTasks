package com.company;

public class JsonMessage implements Message {
    private String body; // = " {i am a : json message } ";

    public JsonMessage() {
    }
    public JsonMessage(String body) {
        this.body = body;
    }
    @Override
    public String prepareMessage() {
        return body + " {i am a : json message } ";
    }
    @Override
    public String getBody() {
        return body;
    }
    @Override
    public String toString() {
        return "JsonMessage{ body='" + body + '}';
    }
}
