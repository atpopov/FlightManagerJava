package flight.werkzeuge;

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
    }

}
