package com.company.frs;

public class RegularTicket extends Ticket {

    private String specialServices;

    public RegularTicket(String pnr, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled, String specialServices) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price, cancelled);
        this.specialServices = specialServices;
    }


    public void setSpecialServices(String specialServices) {
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
