import flights.FlightBoard;

public class Main {

    public static void main(String[] args) {
        FlightBoard flightBoard = new FlightBoard();
        flightBoard.addFlight("Paris");
        flightBoard.passengerManager.createPassenger("Jack",1234);
        flightBoard.start();
    }
}
