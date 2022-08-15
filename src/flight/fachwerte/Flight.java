package flight.fachwerte;

public final class Flight
{
    private final int _id;
    private final String _departureLocation;
    private final String _arrivalLocation;
    private final Date _departureTime;
    private final Date _arrivalTime;

    public Flight(int id, String departureLocation, String arrivalLocation,
            Date departureTime, Date arrivalTime)
    {
        _id = id;
        _departureLocation = departureLocation;
        _arrivalLocation = arrivalLocation;
        _departureTime = departureTime;
        _arrivalTime = arrivalTime;
    }

}
