import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlightBoard {

    ArrayList<Flight> flights;
    Scanner scanner;

    public FlightBoard(){
        this.scanner = new Scanner(System.in);
        this.flights = new ArrayList<>();
    }

    public List<String> getFlights(){
        return flights.stream().map(Object::toString).collect(Collectors.toList());
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
