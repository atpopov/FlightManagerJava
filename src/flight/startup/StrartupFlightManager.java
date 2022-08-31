package flight.startup;

import java.util.ArrayList;
import java.util.List;

import flight.materialien.Flight;
import flight.werkzeuge.FlightWerkzeug;

public class StrartupFlightManager
{
    public static void main(String[] args)
    {
        List<Flight> flights = new ArrayList<Flight>();

        FlightWerkzeug flightListWerkzeug = new FlightWerkzeug(flights);
    }
}
