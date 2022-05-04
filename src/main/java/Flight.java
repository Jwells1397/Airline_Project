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

    public void addPassengerException (Passenger passenger) throws Exception{
        if(!passengers.contains(passenger)) {
            passengers.add(passenger);
        } else {
            throw new Exception("Passenger already on flight");
        }
    }

    public void addPassengerToFlight(Passenger passenger){
        try{
            addPassengerException(passenger);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }

    public void removePassengerException(Passenger passenger) throws Exception{
        if(passengers.contains(passenger)) {
            passengers.remove(passenger);
        } else {
            throw new Exception("Passenger not on flight");
        }
    }

    public void removePassengerFromFlight(Passenger passenger){
        try{
            removePassengerException(passenger);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
