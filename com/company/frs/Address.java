package com.company.frs;

public class Address {
    public   String street;
    public String city;
    public   String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
    public String getAddressDetails() {
        return this.street + ", " + this.city + ", " + this.state;
    }

}
