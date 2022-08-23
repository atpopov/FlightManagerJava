package flight.werkzeuge;

import javax.swing.JPanel;

import flight.werkzeuge.beobachter.Listening;

public class ArrivalDepartureWerkzeug extends Listening
{
    private ArrivalDepartureWerkzeugUI _ui;

    public ArrivalDepartureWerkzeug()
    {
        _ui = new ArrivalDepartureWerkzeugUI();
    }

    /**
     * Reacts, when a new Button is clicked.
     */
    private void buttonIsClicked()
    {
        informAboutChange();
    }

    public JPanel getUIPanel()
    {
        return _ui.getUIPanel();
    }
}
