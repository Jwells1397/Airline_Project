import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class FlightBoardTest {

    Passenger Jack;
    Passenger Adan;
    Flight flight1;

    @BeforeEach
    public void setUp(){
        Jack = new Passenger("Jack",1234);
        Adan = new Passenger("Adan", 5678);
        flight1 = new Flight("Amsterdam");
    }

    @Test
    public void canGetFlights(){

    }
}
