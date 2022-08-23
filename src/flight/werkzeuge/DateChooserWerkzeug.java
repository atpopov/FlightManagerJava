package flight.werkzeuge;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import flight.fachwerte.Datum;
import flight.werkzeuge.beobachter.Listening;

public class DateChooserWerkzeug extends Listening
{
    private DateChooserWerkzeugUI _ui;
    private Datum _chosenDate;

    public DateChooserWerkzeug()
    {
        _chosenDate = Datum.heute();
        _ui = new DateChooserWerkzeugUI(_chosenDate.getFormatiertenString());
        registerUIActions();
    }

    public JPanel getUIPanel()
    {
        return _ui.getUIPanel();
    }

    private void previousButtonIsClicked()
    {
        _chosenDate = _chosenDate.vorherigerTag();
        _ui.getDateLabel()
            .setText(_chosenDate.getFormatiertenString());
        informAboutChange();
    }

    private void nextButtonIsClicked()
    {
        _chosenDate = _chosenDate.naechsterTag();
        _ui.getDateLabel()
            .setText(_chosenDate.getFormatiertenString());
        informAboutChange();
    }

    public Datum getChosenDate()
    {
        return _chosenDate;
    }

    private void registerUIActions()
    {
        _ui.getPreviousDateButton()
            .addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    previousButtonIsClicked();
                }
            });

        _ui.getNextDateButton()
            .addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    nextButtonIsClicked();
                }
            });
    }

}
