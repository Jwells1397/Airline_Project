package flights;

import flights.Flight;
import passenger.PassengerManager;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

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
            flightString += "flights.Flight to: " + f.getDestination() + " Id: " + f.getFlightId() + "\n";
        }
        return flightString;
    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public void addFlight(String destination){
        Flight flight = new Flight(destination);
        flights.add(flight);
    }

    public void cancelFlight(Flight flight){
        flights.remove(flight);
    }

    public void cancelFlight(String input) {
        for (int i = 0; i < flights.size(); i++) {
            Flight f = flights.get(i);
            if (Objects.equals(f.getDestination(), input)) {
                flights.remove(f);
            } else {
                System.out.println("flights.Flight not found");
            }
        }
    }

    public void cancelFlight(int input) {
        for (int i = 0; i < flights.size(); i++) {
            Flight f = flights.get(i);
            if (f.getFlightId() == input) {
                flights.remove(f);
            } else {
                System.out.println("flights.Flight not found");
            }
        }
    }

    public ArrayList<Flight> getAllFlightsList(){
        return flights;
    }

    public void start(){
        System.out.println("Welcome to the app, enter your name");
        String userName = scanner.nextLine();
        while(!exit){
            System.out.println("\n" + "Hello " + userName + " Choose an option:" + "\n" + "\n" + "exit - exit the app" + "\n" + "addpassenger - add a passenger"+ "\n" +
                    "displaylounge - display passengers not on flights" + "\n" + "displayflights - display all flights" + "\n" + "addflight - add a flight" + "\n" +
                    "cancelflight - cancel a flight");
            String option = scanner.nextLine();
            switch(option) {
                case "addpassenger":
                    System.out.println("Add a name");
                    String name = scanner.nextLine();
                    System.out.println("Add contact info");
                    int contactInfo = scanner.nextInt();
                    passengerManager.createPassenger(name, contactInfo);
                    System.out.println("Added " + name +" to lounge");
                    break;
                case "displaylounge":
                    System.out.println(passengerManager.getPassengerLounge());
                    break;
                case "displayflights":
                    System.out.println(getFlights());
                    break;
                case "addflight":
                    System.out.println("Add a destination");
                    String destination = scanner.nextLine();
                    addFlight(destination);
                    System.out.println("Added flight to " + destination);
                    break;
                case "cancelflight":
                    System.out.println(getFlights());
                    System.out.println("Would you like to cancel by 'id' or 'destination' ?");
                    String s = scanner.nextLine();
                    if(Objects.equals(s, "id")){
                        System.out.println("Choose a flight id");
                        int id = scanner.nextInt();
                        cancelFlight(id);
                        System.out.println("flights.Flight with id: " + id + " cancelled");
                        break;
                    } else if(Objects.equals(s, "destination")){
                        System.out.println("Choose a flight destination");
                        String dest = scanner.nextLine();
                        cancelFlight(dest);
                        System.out.println("flights.Flight to " + dest + " cancelled");
                        break;
                    } else {
                        System.out.println("Choose 'id' or 'destination'");
                        break;
                    }
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("Please enter a command");
            }
        }
    }
}
