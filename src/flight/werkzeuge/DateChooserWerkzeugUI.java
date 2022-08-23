package flight.werkzeuge;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DateChooserWerkzeugUI
{
    private JPanel _mainPanel;
    private JButton _previousDateButton;
    private JButton _nextDateButton;
    private JLabel _dateLabel;

    public DateChooserWerkzeugUI(String currentDateString)
    {
        _mainPanel = createPanel(currentDateString);
    }

    private JPanel createPanel(String currentDateString)
    {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        _dateLabel = new JLabel(currentDateString, SwingConstants.CENTER);

        GridBagConstraints constraints = new GridBagConstraints(0, 0, 2, 1, 1.0,
                0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(2, 0, 2, 0), 0, 0);
        mainPanel.add(_dateLabel, constraints);

        Icon backIcon = new ImageIcon("images/go-previous.png");
        _previousDateButton = new JButton(backIcon);

        constraints = new GridBagConstraints(0, 1, 1, 1, 1.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 0, 2, 5), 0, 0);
        mainPanel.add(_previousDateButton, constraints);

        Icon nextIcon = new ImageIcon("images/go-next.png");
        _nextDateButton = new JButton(nextIcon);

        constraints = new GridBagConstraints(1, 1, 1, 1, 1.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 5, 2, 0), 0, 0);
        mainPanel.add(_nextDateButton, constraints);

        return mainPanel;
    }

    public JButton getPreviousDateButton()
    {
        return _previousDateButton;
    }

    public JButton getNextDateButton()
    {
        return _nextDateButton;
    }

    public JLabel getDateLabel()
    {
        return _dateLabel;
    }

    public JPanel getUIPanel()
    {
        return _mainPanel;
    }
}
