package flight.startup;

import java.util.ArrayList;
import java.util.List;

import flight.fachwerte.FlightDirection;
import flight.fachwerte.Plane;
import flight.materialien.Flight;
import flight.werkzeuge.FlightWerkzeug;

public class StrartupFlightManager
{
    public static void main(String[] args)
    {
        List<Flight> flights = new ArrayList<Flight>();
        flights.add(new Flight(1, "Sofia", "Paris", "15:45", "17:25",
                new Plane(1, "Airbus", "A320", 100), "FR337",
                FlightDirection.Departure));

        FlightWerkzeug flightListWerkzeug = new FlightWerkzeug(flights);
    }
}
