package flight.werkzeuge;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class FlightWerkzeugUI
{

    private static final String TITLE = "Flight Manager";

    private JFrame _frame;
    private JButton _endButton;

    public FlightWerkzeugUI(JPanel arrivalDeparture, JPanel dateChooser,
            JPanel flightList)
    {
        _frame = new JFrame(TITLE);
        _frame.setDefaultCloseOperation(_frame.EXIT_ON_CLOSE);
        _frame.getContentPane()
            .setLayout(new BorderLayout());

        JComponent topPanel = createTopPanel();
        JComponent bottomPanel = createBottomPanel();
        JComponent leftPanel = createLeftPanel(arrivalDeparture, dateChooser);
        JComponent rightPanel = createRightPanel(flightList);

        _frame.getContentPane()
            .add(topPanel, BorderLayout.NORTH);
        _frame.getContentPane()
            .add(bottomPanel, BorderLayout.SOUTH);
        _frame.getContentPane()
            .add(leftPanel, BorderLayout.WEST);
        _frame.getContentPane()
            .add(rightPanel, BorderLayout.EAST);
    }

    /**
     * Makes the window visible.
     */
    public void showWindow()
    {
        _frame.setSize(900, 700);
        _frame.setVisible(true);
    }

    /**
     * Closes the window.
     */
    public void closeWindow()
    {
        _frame.dispose();
    }

    /**
     * Creates the top panel.
     * 
     * @return topPanel
     */
    private JPanel createTopPanel()
    {
        JPanel topPanel = new JPanel();
        JLabel label = new JLabel(TITLE, SwingConstants.CENTER);

        label.setForeground(Color.GREEN);

        topPanel.setLayout(new BorderLayout());
        topPanel.add(label, BorderLayout.CENTER);

        return topPanel;
    }

    /**
     * Creates the bottom Panel.
     * 
     * @return bottomPanel
     */
    private JPanel createBottomPanel()
    {
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        bottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        _endButton = new JButton("Exit");
        bottomPanel.add(_endButton);

        return bottomPanel;
    }

    /**
     * Creates the left panel.
     * @param arrivalDeparture
     * @param dateChooser
     * @return leftPanel
     */
    private JPanel createLeftPanel(JPanel arrivalDeparture, JPanel dateChooser)
    {
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout());
        arrivalDeparture.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        dateChooser.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));

        leftPanel.add(dateChooser, BorderLayout.NORTH);
        leftPanel.add(arrivalDeparture, BorderLayout.CENTER);

        return leftPanel;
    }

    private JPanel createRightPanel(JPanel flightList)
    {
        JPanel rightPanel = new JPanel();

        rightPanel.setLayout(new GridLayout());
        flightList.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));

        rightPanel.add(flightList);

        return rightPanel;
    }

    /**
     * Returns the end Button.
     * @return endButton
     */
    public JButton getEndButton()
    {
        return _endButton;
    }
}