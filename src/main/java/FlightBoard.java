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

    public String getFlights(){
        String flightString = "";
        for(int i = 0; i< flights.size();i++){
            Flight f = flights.get(i);
            flightString += "Flight to: " + f.getDestination() + " Id: " + f.getFlightId() + "\n";
        }
        return flightString;
    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public void cancelFlight(Flight flight){
        flights.remove(flight);
    }

    public ArrayList<Flight> getAllFlightsList(){
        return flights;
    }

    public void start(){
        System.out.println("Welcome to the app, enter your name");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + " choose an option");
    }
}
