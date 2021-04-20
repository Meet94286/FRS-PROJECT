package com.company.frs;

public class TouristTicket {
    public String pnr;
    public String from;
    public String to;
    public String flightNumber;
    public String airline;
    public int capacity;
    public int bookedSeats;
    public String departureDateTime;
    public String arrivalDateTime;
    public String street;
    public String city;
    public String state;
    public String name;
    public String phone;
    public String email;
    public String seatNo;
    public float price;
    public boolean cancelled;
    public String hotelAddress;
    public String selectedTouristLocation;

    public TouristTicket(String pnr, String from, String to, String flightNumber, String airline, int capacity, int bookedSeats, String departureDateTime, String arrivalDateTime, String street, String city, String state, String name, String phone, String email, String seatNo, float price, boolean cancelled, String hotelAddress, String selectedTouristLocation) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.street = street;
        this.city = city;
        this.state = state;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }
    public  String checkStatus(){
        if(this.cancelled = true){
            return "Cancelled";
        }else{
            return "Confirmed";
        }
    }
    public  int getFlightDuration(float arrivalTime, float departureTime){
        float FlightDuration = arrivalTime-departureTime;
        return (int) FlightDuration;
    }

    public String getHotelAddress() {
        return this.hotelAddress;
    }

    public String getSelectedTouristLocation() {
        String selectedTouristLocations[] = new String[5];
        return selectedTouristLocation;
    }


    public void removeTouristLocation(String location) {
        this.selectedTouristLocation = location;

    }

    public void addTouristLocation(String location) {
        this.selectedTouristLocation = location;

    }
    public void  cancel(){
        this.cancelled = cancelled;
    }
}

