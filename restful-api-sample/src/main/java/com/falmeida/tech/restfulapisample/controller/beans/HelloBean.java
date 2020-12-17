package com.falmeida.tech.restfulapisample.controller.beans;

public class HelloBean {

    String message;

    public HelloBean(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return String.format("HelloWorldBean [%message%]",message);
    }

}
