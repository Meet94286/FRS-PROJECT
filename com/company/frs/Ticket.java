package com.company.frs;

public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private Flight flight;
    private String departureDateTime;
    private String arrivalDateTime;
    private Passenger passenger;
    private String seatNo;
    private float price;
    public boolean cancelled;

    public Ticket(String pnr, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }

    public Ticket() {

    }


    public String getPnr() {
        return this.pnr;
    }
    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public float getPrice() {
        return price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Flight getFlight() {
        return flight;
    }
    public String getDepartureDateTime() {
        return departureDateTime;
    }


    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
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
}
