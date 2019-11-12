package com.company;

public class XmlMessage implements Message {
    private String body; // = " <i am a Xml message/> ";

    public XmlMessage(){
    }
    public XmlMessage(String body) {
        this.body = body;
    }
    @Override
    public String prepareMessage() {
        return " <i am a Xml message/> ";
    }
    @Override
    public String getBody() {
        return body;
    }
    @Override
    public String toString(){
        return "XmlMessage{ body='" + body + "'" + '}';
    }
}
