package com.company.frs;

public abstract class TouristTicket extends  Ticket {
    private String hotelAddress;
     private String[] selectedTouristLocation = {"LAKE,", "FORT", "BEACH", "VILLA", "MALL"};


    public TouristTicket(String pnr, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled, String hotelAddress, String selectedTouristLocation) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price, cancelled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = new String[]{"LAKE", "FORT"};
    }

    public abstract void printTicketDetails();


    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocations() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocations(String[] selectedTouristLocations) {
        this.selectedTouristLocation = selectedTouristLocations;
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



    public void removeTouristLocation(String location[]) {


    }

    public void addTouristLocation() {}
    public void  cancel() { }

    }

