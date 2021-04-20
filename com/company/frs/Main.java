package com.company.frs;

public class Main {

    public static void main(String[] args) {
        Flight flight = new Flight("A123", "Air India", 1000, 800);
        System.out.println(flight.getBookedSeats());
        System.out.println(flight.getFlightNumber());
        System.out.println(flight.getAirline());
        System.out.println(flight.getCapacity());
        Passenger passenger = new Passenger("Patel Colony", "Ahmedabad", "Gujarat", "MEEt", "9428627509", "Meet@gmail.com");
        Passenger passenger1 = new Passenger("Patel Colony", "Ahmedabad", "Gujarat", "MIT", "9428627509", "Meet@gmail.com");
        Passenger passenger2 = new Passenger("Patel Colony", "Ahmedabad", "Gujarat", "HIT", "9428627509", "Meet@gmail.com");
        Flight flight1 = new Flight("A113", "AIR INDIA", 1000, 900);
        TouristTicket touristTicket = new TouristTicket("1234567", "MUMBAI", "KERALA", flight1, "21/4/2021 9:00 IST", "21/4/2021 11:00 IST", passenger, "A1", 5000f, false, "TAJ HOTEL", "{GARDEN, FORT, BEACH}") {

            public void printTicketDetails() {

            }
        };
        System.out.println(touristTicket.getPnr());
         RegularTicket regularTicket = new RegularTicket("1234568", "MUMBAI", "DELHI", flight, "22/4/2021 10:00 IST", "22/4/2021 12:00 IST", passenger1, "A3", 3000f, false, "FOOD and WATER");
        System.out.println(passenger.getAddressDetails());
        System.out.println(passenger.getContactDetails());
        System.out.println(passenger.getId());
        System.out.println(passenger.getPassengerCount());
        System.out.println(touristTicket.getDepartureDateTime());
        Ticket ticket = new Ticket("1234568", "MUMBAI", "DELHI", flight, "22/4/2021 10:00 IST", "22/4/2021 12:00 IST", passenger1, "A3", 3000f, false) {

            public void printTicketDetails(Ticket ticket1){
                System.out.println(ticket1.getPnr());
            }Ticket ticket = new Ticket() {
                @Override
                public String getPnr() {
                    return ticket.getPnr();
                }
            };
            };}}















