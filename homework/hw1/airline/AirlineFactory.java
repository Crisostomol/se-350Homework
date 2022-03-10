package homework.hw1.airline;

import homework.hw1.exception.BadParameterException;
import homework.hw1.exception.NullParameterException;

import java.util.HashMap;
import java.util.Map;

public class AirlineFactory {

    private static Map<String, Airline> airlines = new HashMap<>();

    public static Airline getAirline(String airlineName) {
        return airlines.computeIfAbsent(airlineName, (an) -> {
            try {
                return new Airline(an);
            } catch (NullParameterException | BadParameterException e) {
                e.printStackTrace();
            }

            return null;
        });
    }
}