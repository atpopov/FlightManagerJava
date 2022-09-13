package flight.werkzeuge;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import flight.materialien.Flight;

public class FlightWerkzeug
{
    private List<Flight> _flights;

    private FlightWerkzeugUI _ui;

    private ArrivalDepartureWerkzeug _arrivalDepartureWerkzeug;
    private DateChooserWerkzeug _dateChooserWerkzeug;
    private FlightListWerkzeug _flightListWerkzeug;

    public FlightWerkzeug(List<Flight> flights)
    {
        _flights = flights;

        _flightListWerkzeug = new FlightListWerkzeug(_flights);
        _dateChooserWerkzeug = new DateChooserWerkzeug(_flightListWerkzeug);
        _arrivalDepartureWerkzeug = new ArrivalDepartureWerkzeug(
                _flightListWerkzeug, _dateChooserWerkzeug);

        _ui = new FlightWerkzeugUI(_arrivalDepartureWerkzeug.getUIPanel(),
                _dateChooserWerkzeug.getUIPanel(),
                _flightListWerkzeug.getUIPanel());

        registerUIActions();

        _ui.showWindow();
    }

    private void registerUIActions()
    {
        _ui.getEndButton()
            .addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    reactWhenEndButtonIsClicked();
                }
            });
    }

    private void reactWhenEndButtonIsClicked()
    {
        _ui.closeWindow();
    }
}
