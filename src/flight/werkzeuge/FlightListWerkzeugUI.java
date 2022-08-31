package flight.werkzeuge;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;

import flight.materialien.Flight;

public class FlightListWerkzeugUI
{
    private List<Flight> _flights;

    private JPanel _primaryPanel;

    private final String[] _tableCellNames = {"Flight Number", "From", "To",
            "Estimated Departure", "Estimated Arrival"};
    private Object[][] _tableData;
    private JTable _table;

    public FlightListWerkzeugUI(List<Flight> flights)
    {
        _flights = flights;
        if (flights.size() == 0)
        {
            flights
                .add(new Flight(0, null, null, null, null, null, null, null));
        }

        _tableData = new Object[flights.size()][6];
        _primaryPanel = createPanel();
    }

    private JPanel createPanel()
    {
        JPanel panel = new JPanel();

        int counter = 0;
        for (Flight flight : _flights)
        {
            _tableData[counter][0] = flight.getFlightNumber();
            _tableData[counter][1] = flight.getDepartureLocation();
            _tableData[counter][2] = flight.getArrivalLocation();
            _tableData[counter][3] = flight.getDepartureTime();
            _tableData[counter][4] = flight.getArrivalTime();
            counter++;
        }

        _table = new JTable(_tableData, _tableCellNames);
        panel.add(_table);

        return panel;
    }

    public JPanel getUIPanel()
    {
        return _primaryPanel;
    }

}
