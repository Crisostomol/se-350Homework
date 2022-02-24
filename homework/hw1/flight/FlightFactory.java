package homework.hw1.flight;

import homework.hw1.airline.Airline;
import homework.hw1.airport.Airport;
import homework.hw1.exception.NullParameterException;

public class FlightFactory {
    private FlightFactory() {
    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination) {
        if (type.equals("commercialFlight"))
            return new CommercialFlight(airline,destination);

        else return null;
    }

    public static Flight passangerFlight(Integer type, passangerCapacity) {
        if (type.equals("commercialFlight"))
            return new CommercialFlight(airline,destination);

        else return null;


}