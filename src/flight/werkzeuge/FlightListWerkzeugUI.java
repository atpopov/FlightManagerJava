package flight.werkzeuge;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

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

        JComponent topPanel = createTopPanel();
        JComponent bottomPanel = createBottomPanel();

        _frame.getContentPane()
            .add(topPanel, BorderLayout.NORTH);
        _frame.getContentPane()
            .add(bottomPanel, BorderLayout.SOUTH);
    }

    public void showWindow()
    {
        _frame.setSize(900, 700);
        _frame.setVisible(true);
    }

    public void closeWindow()
    {
        _frame.dispose();
    }

    private JPanel createTopPanel()
    {
        JPanel topPanel = new JPanel();
        JLabel label = new JLabel(TITLE, SwingConstants.CENTER);

        label.setForeground(Color.GREEN);

        topPanel.setLayout(new BorderLayout());
        topPanel.add(label, BorderLayout.CENTER);

        return topPanel;
    }

    private JPanel createBottomPanel()
    {
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        bottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        _endButton = new JButton("End");
        bottomPanel.add(_endButton);

        return bottomPanel;
    }
}