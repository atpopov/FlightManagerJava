package flight.werkzeuge;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ArrivalDepartureWerkzeugUI
{
    private JPanel _mainPanel;

    public ArrivalDepartureWerkzeugUI()
    {
        _mainPanel = createMainPanel();
    }

    private JPanel createMainPanel()
    {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton departures = new JButton("Departures");
        JButton arrivals = new JButton("Arrivals");

        mainPanel.add(departures);
        mainPanel.add(arrivals);

        return mainPanel;
    }

    public JPanel getUIPanel()
    {
        return _mainPanel;
    }
}
