package flight.werkzeuge;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import flight.fachwerte.Datum;
import flight.fachwerte.FlightDirection;
import flight.materialien.Flight;
import flight.werkzeuge.beobachter.Listening;

public class FlightListWerkzeug extends Listening
{
    private List<Flight> _flights;
    private List<Flight> _actualFlights;
    private boolean _isDeparturesSelected = true;

    private FlightListWerkzeugUI _ui;

    public FlightListWerkzeug(List<Flight> flights)
    {
        _flights = flights;
        _actualFlights = flights;

        _ui = new FlightListWerkzeugUI(_flights);

    }

    public JPanel getUIPanel()
    {
        return _ui.getUIPanel();
    }

    public void actualiseFlightList(boolean isDeparturesSelected,
            Datum currentDate)
    {
        _actualFlights = new ArrayList<Flight>();
        if (isDeparturesSelected)
        {
            for (Flight flight : _flights)
            {
                if ((flight.getFlightDirection() == FlightDirection.Departure)
                        && (flight.getDepartureorArrivalDate()
                            .equals(currentDate)))
                {
                    _actualFlights.add(flight);
                }
            }
        }
        else
        {
            for (Flight flight : _flights)
            {
                if ((flight.getFlightDirection() == FlightDirection.Arrival)
                        && (flight.getDepartureorArrivalDate()
                            .equals(currentDate)))
                {
                    _actualFlights.add(flight);
                }
            }
        }
        _isDeparturesSelected = isDeparturesSelected;
        _ui.getTable()
            .setModel(_ui.aktualisePanel(_actualFlights));
        informAboutChange();
    }

    public boolean getIsDeparturesSelected()
    {
        return _isDeparturesSelected;
    }

}
