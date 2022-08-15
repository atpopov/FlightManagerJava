package flight.fachwerte;

import java.util.Date;

public final class Flight
{
    private final int _id;
    private final String _departureLocation;
    private final String _arrivalLocation;
    private final Date _departureTime;
    private final Date _arrivalTime;
    private final Plane _plane;

    public Flight(int id, String departureLocation, String arrivalLocation,
            Date departureTime, Date arrivalTime, Plane plane)
    {
        _id = id;
        _departureLocation = departureLocation;
        _arrivalLocation = arrivalLocation;
        _departureTime = departureTime;
        _arrivalTime = arrivalTime;
        _plane = plane;
    }

}
