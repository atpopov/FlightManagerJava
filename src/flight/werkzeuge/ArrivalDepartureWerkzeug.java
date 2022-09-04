package flight.werkzeuge;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import flight.werkzeuge.beobachter.Listening;

public class ArrivalDepartureWerkzeug extends Listening
{
    private ArrivalDepartureWerkzeugUI _ui;

    private FlightListWerkzeug _flightListWerkzeug;

    private boolean _isDeparturesSelected;

    public ArrivalDepartureWerkzeug(FlightListWerkzeug flightListWerkzeug)
    {
        _ui = new ArrivalDepartureWerkzeugUI();
        _flightListWerkzeug = flightListWerkzeug;
        _isDeparturesSelected = true;

        registerUIActions();
    }

    /**
     * Reacts, when a new Button is clicked.
     */
    private void departuresButtonIsClicked()
    {
        _isDeparturesSelected = true;
        _flightListWerkzeug.actualiseFlightList(_isDeparturesSelected);
        informAboutChange();
    }

    private void arrivalsButtonIsClicked()
    {
        _isDeparturesSelected = false;
        _flightListWerkzeug.actualiseFlightList(_isDeparturesSelected);
        informAboutChange();
    }

    public JPanel getUIPanel()
    {
        return _ui.getUIPanel();
    }

    private void registerUIActions()
    {
        _ui.getDeparturesButton()
            .addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    _ui.getDeparturesButton()
                        .setBackground(Color.GREEN);
                    _ui.getArrivalsButton()
                        .setBackground(null);
                    departuresButtonIsClicked();
                }
            });

        _ui.getArrivalsButton()
            .addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    _ui.getArrivalsButton()
                        .setBackground(Color.GREEN);
                    _ui.getDeparturesButton()
                        .setBackground(null);
                    arrivalsButtonIsClicked();
                }
            });
    }
}
