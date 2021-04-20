package com.company.frs;

public class Contact {
    public  String name;
    public   String phone;
    public   String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public String getContactDetails() {
        return this.name + ", " + this.phone + ", " + this.email;
    }
}
