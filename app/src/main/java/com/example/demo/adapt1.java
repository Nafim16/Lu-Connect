package com.example.demo;

import com.google.firebase.firestore.FieldValue;

public class adapt1 {

    private String postImageUri,currentUserId,caption,Time;




    public adapt1(String postImageUri, String currentUserId, String caption, FieldValue time) {
        this.postImageUri = postImageUri;
        this.currentUserId = currentUserId;
        this.caption = caption;
        this.Time = String.valueOf(time);
    }

    public String getPostImageUri() {
        return postImageUri;
    }

    public void setPostImageUri(String postImageUri) {
        this.postImageUri = postImageUri;
    }

    public String getCurrentUserId() {
        return currentUserId;
    }

    public void setCurrentUserId(String currentUserId) {
        this.currentUserId = currentUserId;
    }

    public String getCaptio() {
        return caption;
    }

    public void setCaptio(String captio) {
        this.caption = caption;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}