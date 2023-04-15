package com.example.alertapp;

public class User {

    public String email, userName, phone, pass;

    public User() {
    }


    public User(String email, String phone, String userName, String pass) {
        this.email = email;
        this.phone = phone;
        this.userName = userName;
        this.pass = pass;
    }

    public void setPass(String pass) {this.pass = pass;}

    public String getPass() {
        return pass;
    }

    public void setPhone(String phone) {this.phone = phone;}

    public String getEmail() {
        return email;
    }

    public String getPhone() {
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
