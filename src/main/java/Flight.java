import java.util.ArrayList;

public class Flight {

    String destination;
    int FlightId;
    ArrayList<Passenger> passengers;

    public Flight(String destination){
        this.destination = destination;
        this.passengers = new ArrayList<>();
        this.FlightId =  FlightIdGen.genFlightId();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightId() {
        return FlightId;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassenger throws Exception (Passenger passenger){
        if(!passengers.contains(passenger)) {
            passengers.add(passenger);
        } else {
            throw new Exception("Passenger already on flight");
        }
    }

    public void removePassenger(Passenger passenger){
        passengers.remove(passenger);
    }


}
