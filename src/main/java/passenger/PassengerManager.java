package passenger;

import java.util.ArrayList;

public class PassengerManager {

    ArrayList<Passenger> passengersWaiting;

    public PassengerManager(){
        passengersWaiting = new ArrayList<>();
    }

    public void createPassenger(){
        Passenger passenger = new Passenger("",0);
        passenger.setName("name");
        passenger.setContactInfo(00);
        passengersWaiting.add(passenger);
    }
}
