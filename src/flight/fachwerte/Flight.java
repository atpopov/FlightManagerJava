package flight.fachwerte;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class Flight
{
    private final int _id;
    private final String _departureLocation;
    private final String _arrivalLocation;
    private final Date _departureTime;
    private final Date _arrivalTime;
    private final Plane _plane;
    private Map<String, Passenger> _passengers;

    public Flight(int id, String departureLocation, String arrivalLocation,
            Date departureTime, Date arrivalTime, Plane plane)
    {
        _id = id;
        _departureLocation = departureLocation;
        _arrivalLocation = arrivalLocation;
        _departureTime = departureTime;
        _arrivalTime = arrivalTime;
        _plane = plane;
        _passengers = new HashMap<String, Passenger>();
    }

    public int getId()
    {
        return _id;
    }

    public String getDepartureLocation()
    {
        return _departureLocation;
    }

    public String getArrivalLocation()
    {
        return _arrivalLocation;
    }

    public Date getDepartureTime()
    {
        return _departureTime;
    }

    public Date getArrivalTime()
    {
        return _arrivalTime;
    }

    public Plane getPlane()
    {
        return _plane;
    }

    public Map<String, Passenger> getPassengers()
    {
        return _passengers;
    }

}
