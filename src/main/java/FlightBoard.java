import passenger.PassengerManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlightBoard {

    ArrayList<Flight> flights;
    Scanner scanner;
    PassengerManager passengerManager;
    boolean exit;

    public FlightBoard(){
        this.scanner = new Scanner(System.in);
        this.flights = new ArrayList<>();
        this.passengerManager = new PassengerManager();
        this.exit = false;
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
        System.out.println("Hello " + userName + " choose an option" + "\n" + "addpassenger - add a passenger"+ "\n" + "display - display all flights" + "\n" + "addflight - add a flight");
        String option = scanner.nextLine();
        switch(option){
            case "addpassenger":
                System.out.println("Add a name");
                String name = scanner.nextLine();
                System.out.println("Add contact info");
                int contactInfo = scanner.nextInt();
                passengerManager.createPassenger(name,contactInfo);
                System.out.println(passengerManager.getPassengersWaiting());
            case "display":
                System.out.println(getFlights());
            case "addflight":
        }
    }
}
