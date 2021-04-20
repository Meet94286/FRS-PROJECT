package com.company.frs;

public class Passenger {
    private  int id;
    private  String street;
    private  String city;
    private  String state;
    private  String name;
    private  String phone;
    private  String email;


    public Passenger(int id, String street, String city, String state, String name, String phone, String email) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public String getAddressDetails() {
        return this.street + ", " + this.city + ", " + this.state;
    }

    public String getContactDetails() {
        return this.name + ", " + this.phone + ", " + this.email;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
