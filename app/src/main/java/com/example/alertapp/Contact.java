package com.example.alertapp;

public class Contact {

    public String email, userName;
    int phone;

    public Contact() {
    }


    public Contact(String email, int phone, String userName) {
        this.email = email;
        this.phone = phone;
        this.userName = userName;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
