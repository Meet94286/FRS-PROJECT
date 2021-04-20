package com.company.frs;

public class Passenger {
    private static int idCounter;
    static {
        idCounter = 0;
    }

    private int id;

    public Passenger(String addressStreet, String addressCity,
                     String addressState, String contactName, String contactPhone,
                     String contactEmail) {
        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity,addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }

    public int getPassengerCount(){
        return idCounter;
    }

    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private Address address;

    private static class Contact {
        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }
    private Contact contact;



    public int getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }

    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }

    public String getContactDetails() {
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }
}



