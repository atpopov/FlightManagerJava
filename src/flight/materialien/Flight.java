package flight.materialien;

import java.util.HashMap;
import java.util.Map;

import flight.fachwerte.Datum;
import flight.fachwerte.FlightDirection;
import flight.fachwerte.Passenger;
import flight.fachwerte.Plane;

public class Flight
{
    private final int _id;
    private final String _departureLocation;
    private final String _arrivalLocation;
    private final Datum _deparrDate;
    private final String _departureTime;
    private final String _arrivalTime;
    private final Plane _plane;
    private final String _flightNumber;
    private final FlightDirection _flightDirection;
    private Map<String, Passenger> _passengers;

    public Flight(int id, String departureLocation, String arrivalLocation,
            Datum deparrDate, String departureTime, String arrivalTime,
            Plane plane, String flightNumber, FlightDirection flightDirection)
    {
        _id = id;
        _departureLocation = departureLocation;
        _arrivalLocation = arrivalLocation;
        _departureTime = departureTime;
        _deparrDate = deparrDate;
        _arrivalTime = arrivalTime;
        _plane = plane;
        _flightNumber = flightNumber;
        _flightDirection = flightDirection;
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

    public Datum getDepartureorArrivalDate()
    {
        return _deparrDate;
    }

    public String getDepartureTime()
    {
        return _departureTime;
    }

    public String getArrivalTime()
    {
        return _arrivalTime;
    }

    public Plane getPlane()
    {
        return _plane;
    }

    public String getFlightNumber()
    {
        return _flightNumber;
    }

    public FlightDirection getFlightDirection()
    {
        return _flightDirection;
    }

    public Map<String, Passenger> getPassengers()
    {
        return _passengers;
    }

    /**
     * 
     * @param passenger
     * 
     * @require passenger != null
     * @require seat != null
     */
    public void addPassenger(String seat, Passenger passenger)
    {
        assert passenger != null : "Vorbedingung verletzt: passenger != null";
        assert seat != null : "Vorbedingung verletzt: seat != null";

        _passengers.put(seat, passenger);
    }

    public boolean isSeatFree(String seat)
    {
        return !_passengers.containsKey(seat);
    }

    public boolean isPassengerOnBoard(Passenger passenger)
    {
        return _passengers.containsValue(passenger);
    }
}
