package com.company.frs;

public class Flight {
    public String flightNumber;
    public String airline;
    public int capacity;
    public    int bookedSeats;




    public Flight(String flightNumber, String airline, int capacity, int bookedSeats){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;}

        public String getflightDetails(){
            return this.airline + ", " + this.capacity + ", " + this.bookedSeats;
        }
        public boolean checkAvailability(){
            boolean available;
            if (this.bookedSeats>=capacity){
                return available = false;
            }else {
               return  available = true;
            }
        }
    }
