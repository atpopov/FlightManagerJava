package flight.werkzeuge;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import flight.materialien.Flight;

public class FlightListWerkzeug
{
    private List<Flight> _flights;

    private FlightListWerkzeugUI _ui;

    private ArrivalDepartureWerkzeug _arrivalDepartureWerkzeug;
    private DateChooserWerkzeug _dateChooserWerkzeug;

    public FlightListWerkzeug(List<Flight> flights)
    {
        _flights = flights;

        _arrivalDepartureWerkzeug = new ArrivalDepartureWerkzeug();
        _dateChooserWerkzeug = new DateChooserWerkzeug();

        _ui = new FlightListWerkzeugUI(_arrivalDepartureWerkzeug.getUIPanel(),
                _dateChooserWerkzeug.getUIPanel());

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
