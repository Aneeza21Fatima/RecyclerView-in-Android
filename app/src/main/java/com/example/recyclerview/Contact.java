package com.example.recyclerview;

public class Contact {
    private String name;
    private String email;
    private int  imageResourceId;

    public Contact(String name , String email , int imageResourceId){
        this.name=name;
        this.email=email;
        this.imageResourceId=imageResourceId;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
