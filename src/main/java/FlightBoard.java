import java.util.ArrayList;

public class FlightBoard {

    ArrayList<Flight> flights;

    public FlightBoard(){
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public void cancelFlight(Flight flight){
        flights.remove(flight);
    }

    public ArrayList<Flight> getAllFlights(){
        return flights;
    }
}
