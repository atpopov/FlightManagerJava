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

    private JPanel createLeftPanel()
    {
        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));

        return leftPanel;
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