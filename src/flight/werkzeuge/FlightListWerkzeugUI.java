package flight.werkzeuge;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
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

        _primaryPanel = createPanel(_flights);
    }

    private JPanel createPanel(List<Flight> flights)
    {
        JPanel panel = new JPanel();
        _tableData = fillTableData(flights);

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

        //Something is wrong with this code. Try to fix it!
        /*TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(
                _table.getModel());
        _table.setRowSorter(sorter);
        
        List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
        sortKeys.add(new RowSorter.SortKey(3, SortOrder.ASCENDING));
        sortKeys.add(new RowSorter.SortKey(4, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);*/

        _table.setAutoCreateRowSorter(true);

        JScrollPane scrollPane = new JScrollPane(_table);
        _table.setFillsViewportHeight(true);

        panel.add(scrollPane);

        return panel;
    }

    public DefaultTableModel aktualisePanel(List<Flight> flights)
    {
        _tableData = fillTableData(flights);

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

        return tableModel;

    }

    private Object[][] fillTableData(List<Flight> flights)
    {
        _tableData = new Object[flights.size()][6];

        int counter = 0;
        for (Flight flight : flights)
        {
            _tableData[counter][0] = flight.getFlightNumber();
            _tableData[counter][1] = flight.getDepartureLocation();
            _tableData[counter][2] = flight.getArrivalLocation();
            _tableData[counter][3] = flight.getDepartureTime();
            _tableData[counter][4] = flight.getArrivalTime();
            counter++;
        }

        return _tableData;
    }

    public JTable getTable()
    {
        return _table;
    }

    public JPanel getUIPanel()
    {
        return _primaryPanel;
    }

}
