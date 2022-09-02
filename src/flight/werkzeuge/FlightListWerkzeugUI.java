package flight.werkzeuge;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

        DefaultTableModel tableModel = new DefaultTableModel(_tableData,
                _tableCellNames)
        {

            @Override
            public boolean isCellEditable(int row, int column)
            {
                //all cells false
                return false;
            }
        };

        _table.setModel(tableModel);
        panel.add(_table);

        return panel;
    }

    public JPanel aktuallisePanel(List<Flight> flights)
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

    public JTable getTable()
    {
        return _table;
    }

    public void switchPanel(JPanel newPanel)
    {
        _primaryPanel = newPanel;
    }

    public JPanel getUIPanel()
    {
        return _primaryPanel;
    }

}
