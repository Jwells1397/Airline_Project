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

    public String getPassengerLounge(){
        String passString = "";
        for(int i = 0; i< passengersWaiting.size();i++){
            Passenger p = passengersWaiting.get(i);
            passString += "Name: " + p.getName() + " Id: " + p.getPassId() + "\n";
        }
        return passString;
    }

}
