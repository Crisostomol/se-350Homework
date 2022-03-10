package homework.hw1.flight;
import homework.hw1.airline.Airline;
import homework.hw1.airport.Airport;
import homework.hw1.exception.NullParameterException;

import java.util.Objects;

public class PassengerFlight extends Flight {

    private int passengerCapacity;

    public PassengerFlight(Airline airline, Airport origin, Airport destination, int passengerCapacity) throws NullParameterException {
        super(airline, origin, destination);
        setPassengerCapacity(passengerCapacity);
    }


    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
