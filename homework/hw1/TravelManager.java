package homework.hw1;

import homework.hw1.airline.Airline;
import homework.hw1.airport.Airport;
import homework.hw1.exception.BadParameterException;
import homework.hw1.exception.NullParameterException;
import homework.hw1.flight.Flight;

public class TravelManager {

    public static void main(String[] args) {
        try {
            Airline airline = new Airline("Spirit");
            Airport origin = new Airport("ORD");
            Airport destination = new Airport("DFW");

            Flight flight = new Flight(airline, origin, destination);

            System.out.println(flight);
        } catch (NullParameterException ex) {
            ex.printStackTrace();
        } catch (BadParameterException ex) {
            ex.printStackTrace();
        }
    }

}