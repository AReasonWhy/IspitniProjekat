package com.example.androiddevelopment.ispit.model;

/**
 * Created by androiddevelopment on 20.3.17..
 */

public class Contact {

    private int id;
    String name;
    String sName;
    String image;
    String address;
    String TelN;

    public Contact(){

    };

    public Contact(int id, String name, String sName, String image, String address, String telN) {
        this.id = id;
        this.name = name;
        this.sName = sName;
        this.image = image;
        this.address = address;
        TelN = telN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelN() {
        return TelN;
    }

    public void setTelN(String telN) {
        TelN = telN;
    }
}
