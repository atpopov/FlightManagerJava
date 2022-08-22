package flight.werkzeuge;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlightListWerkzeugUI
{

    private static final String TITLE = "Flight Manager";

    private JFrame _frame;
    private JButton _endButton;

    public FlightListWerkzeugUI()
    {
        _frame = new JFrame(TITLE);
        _frame.setDefaultCloseOperation(_frame.EXIT_ON_CLOSE);
        _frame.getContentPane()
            .setLayout(new BorderLayout());
    }

    public void showWindow()
    {
        _frame.setSize(1200, 900);
        _frame.setVisible(true);
    }

    public void closeWindow()
    {
        _frame.dispose();
    }
}