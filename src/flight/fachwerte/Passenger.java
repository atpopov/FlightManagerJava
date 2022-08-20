package flight.fachwerte;

import java.util.Date;

public final class Passenger
{
    private final int _id;
    private final String _name;
    private final String _surname;
    private final Date _birthDate;
    private final String _originCountry;

    public Passenger(int id, String name, String surname, Date birthDate,
            String originCountry)
    {
        _id = id;
        _name = name;
        _surname = surname;
        _birthDate = birthDate;
        _originCountry = originCountry;
    }

    public int getId()
    {
        return _id;
    }

    public String getName()
    {
        return _name;
    }

    public String getSurname()
    {
        return _surname;
    }

    public Date getBirthDate()
    {
        return _birthDate;
    }

    public String getOriginCountry()
    {
        return _originCountry;
    }
}
