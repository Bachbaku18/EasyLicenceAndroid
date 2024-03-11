package com.example.easylicence.models;

public class TrafficSigns {

    String Code;

    String Name;

    int Image;

    public TrafficSigns(String code, String name, int image) {
        Code = code;
        Name = name;
        Image = image;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
