package com.example.demo;

public class postAdaptor {

    private String cap, time;

    public postAdaptor(String caption, String timestamp) {
        this.cap = caption;
        this.time = timestamp;

    }

    public String getCaption() {
        return cap;
    }

    public void setCaption(String caption) {
        this.cap = caption;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}