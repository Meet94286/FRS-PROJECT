package com.company.frs;

public class Main {

    public static void main(String[] args) {
        Flight flight = new Flight ("A15", "Air India", 1000, 900);
        Contact contact = new Contact("Meet", "9428627509", "Meet@gmail.com");
        Address address = new Address("Patel colony", "Ahmedabad", "Gujarat");
        TouristTicket touristTicket = new TouristTicket("123", "Mumbai", "Delhi", "A15","Air India",1000, 500,"21/4/2021 9:00 IST", "21/4/2021 11:00 IST", "Patel colony", "Ahmedabad", "Gujarat", "Meet", "9428627509", "meet@gmail.com", "A2", 5000f, false, "Taj Hotel", "Taj Mahal" );
        RegularTicket regularTicket = new RegularTicket("321", "Mumbai", "Kerala", "B115", "Go Air",1000,700,"13/4/2021 9:00 IST", "13/4/2021 11:00 IST", "Patel colony","Ahmedabad", "Gujarat", "Meet", "12345678910", "Meet@gmail.com", "A3", 7000f, false, "Food and Water");
        Passenger passenger = new Passenger(1, "Patel colony", "Ahmedabad", "Gujarat", "Meet", "9428627509", "Meet@gmail.com");
        System.out.println(flight.getflightDetails());
        System.out.println(flight.checkAvailability());
        System.out.println(flight.bookedSeats);
        System.out.println(contact.getContactDetails());
        System.out.println(address.getAddressDetails());
        System.out.println(regularTicket.getSpecialServices());
        System.out.println(regularTicket.getFlightDuration(11f, 9f));
        System.out.println(touristTicket.selectedTouristLocation);


    }
}
