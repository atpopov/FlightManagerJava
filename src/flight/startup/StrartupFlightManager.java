package flight.startup;

import java.util.ArrayList;
import java.util.List;

import flight.fachwerte.Datum;
import flight.fachwerte.FlightDirection;
import flight.fachwerte.Plane;
import flight.materialien.Flight;
import flight.werkzeuge.FlightWerkzeug;

public class StrartupFlightManager
{
    public static void main(String[] args)
    {
        List<Flight> flights = new ArrayList<Flight>();
        flights.add(new Flight(1, "Sofia", "Paris", Datum.heute(), "15:45",
                "17:25", new Plane(1, "Airbus", "A320", 100), "FR337",
                FlightDirection.Departure));
        flights.add(new Flight(1, "Sofia", "Paris", Datum.heute()
            .vorherigerTag(), "15:45", "17:25",
                new Plane(1, "Airbus", "A320", 100), "FR337",
                FlightDirection.Departure));
        flights.add(new Flight(2, "Plovdiv", "Barcelona", Datum.heute(),
                "18:45", "19:25", new Plane(1, "Airbus", "A320", 100), "FR458",
                FlightDirection.Arrival));
        flights.add(new Flight(2, "Burgas", "Hamburg", Datum.heute(), "12:45",
                "13:25", new Plane(1, "Airbus", "A320", 100), "FR758",
                FlightDirection.Arrival));
        flights.add(new Flight(2, "Burgas", "Hamburg", Datum.heute()
            .naechsterTag(), "12:45", "13:25",
                new Plane(1, "Airbus", "A320", 100), "FR758",
                FlightDirection.Arrival));

        FlightWerkzeug flightListWerkzeug = new FlightWerkzeug(flights);
    }
}
