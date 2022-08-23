package flight.fachwerte;

public final class Passenger
{
    private final int _id;
    private final String _name;
    private final String _surname;
    private final Datum _birthDate;
    private final String _originCountry;
    private final String _identityNumber;

    public Passenger(int id, String name, String surname, Datum birthDate,
            String originCountry, String identityNumber)
    {
        _id = id;
        _name = name;
        _surname = surname;
        _birthDate = birthDate;
        _originCountry = originCountry;
        _identityNumber = identityNumber;
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

    public Datum getBirthDate()
    {
        return _birthDate;
    }

    public String getOriginCountry()
    {
        return _originCountry;
    }

    public String getIdentityNumber()
    {
        return _identityNumber;
    }

    @Override
    public int hashCode()
    {
        int base = 15;
        return base * Integer.parseInt(_identityNumber)
                + Integer.parseInt(_name) + Integer.parseInt(_surname)
                + Integer.parseInt(_originCountry);
    }

    private boolean equals(Passenger other)
    {
        return (this._identityNumber.equals(other._identityNumber)
                && this._name.equals(other._name)
                && this._surname.equals(other._surname));
    }

    @Override
    public String toString()
    {
        return "Surname: " + _surname + "\n" + "Name: " + _name + "\n"
                + "Date of Birth: " + _birthDate + "\n" + "Country of Origin: "
                + _originCountry + "\n" + "ID Card Number: " + _identityNumber;
    }
}
