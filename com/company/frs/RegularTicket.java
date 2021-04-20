package com.company.frs;

public class RegularTicket {
    public String pnr;
    public String from;
    public String to;
    public String flightNumber;
    public String airline;
    public int capacity;
    public int bookedSeats;
    public String departureDateTime;
    public String arrivalDateTime;
    public int id;
    public String street;
    public String city;
    public String state;
    public String name;
    public String phone;
    public String email;
    public String seatNo;
    public float price;
    public boolean cancelled;
    private  String specialServices;


    public RegularTicket(String pnr, String from, String to, String flightNumber, String airline, int capacity, int bookedSeats, String departureDateTime, String arrivalDateTime, String street, String city, String state, String name, String phone, String email, String seatNo, float price, boolean cancelled, String specialServices) {

        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.specialServices = specialServices;
    }

    public  String getSpecialServices(){
        return "Requested special services: food, water, snacks";
    }
    public void updateSpecialServices(){
        this.specialServices = getSpecialServices();
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
    public void  cancel(){
        this.cancelled = cancelled;
    }
}
