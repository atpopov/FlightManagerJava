package flight.werkzeuge;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ArrivalDepartureWerkzeugUI
{
    private JPanel _mainPanel;

    private JButton _departures;
    private JButton _arrivals;

    public ArrivalDepartureWerkzeugUI()
    {
        _mainPanel = createMainPanel();
    }

    private JPanel createMainPanel()
    {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        _departures = new JButton("Departures");
        _arrivals = new JButton("Arrivals");

        mainPanel.add(_departures);
        mainPanel.add(_arrivals);

        return mainPanel;
    }

    public JPanel getUIPanel()
    {
        return _mainPanel;
    }

    public JButton getDeparturesButton()
    {
        return _departures;
    }

    public JButton getArrivalsButton()
    {
        return _arrivals;
    }
}
