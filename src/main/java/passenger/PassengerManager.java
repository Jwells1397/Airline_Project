package passenger;

import java.util.ArrayList;

public class PassengerManager {

    ArrayList<Passenger> passengersWaiting;

    public PassengerManager(){
        passengersWaiting = new ArrayList<>();
    }

    public void createPassenger(String name, int contactInfo){
        Passenger passenger = new Passenger(name,contactInfo);
        passengersWaiting.add(passenger);
    }

    public ArrayList<Passenger> getPassengersWaiting() {
        return passengersWaiting;
    }

}
