package homework.hw1;

import homework.hw1.airline.Airline;
import homework.hw1.airport.Airport;
import homework.hw1.flight.Flight;

import java.util.Optional;


    public interface FlightManager {
        public String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) throws Exception;
        public Optional<Flight> getFlightByFlightNumber(String flightNumber) throws Exception;
    }