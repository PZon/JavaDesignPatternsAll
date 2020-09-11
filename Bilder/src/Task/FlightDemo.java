package Task;

/**
 * Created by PZON_SM on 10.08.2020.
 **/
public class FlightDemo {
    public static void main(String[] args){
        Flight flight = new Flight.FlightBuilder("Kraków", "Warszawa")
                .setBuilderPrice(13)
                .build();

       // flight.setDelayed(true);
        System.out.println(flight);
    }
}
