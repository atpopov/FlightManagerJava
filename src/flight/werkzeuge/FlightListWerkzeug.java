package flight.werkzeuge;

import java.util.List;

import flight.materialien.Flight;

public class FlightListWerkzeug
{
    private List<Flight> _flights;

    private FlightListWerkzeugUI _ui;

    public FlightListWerkzeug(List<Flight> flights)
    {
        _flights = flights;

        _ui = new FlightListWerkzeugUI();
    }
}
