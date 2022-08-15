package flight.fachwerte;

import java.util.HashMap;
import java.util.Map;

public final class Plane
{
    private final int _id;
    private final String _brand;
    private final String _model;
    private final int _capacity;
    private Map<Passenger, String> _passengers;

    public Plane(int id, String brand, String model, int capacity)
    {
        _id = id;
        _brand = brand;
        _model = model;
        _capacity = capacity;
        _passengers = new HashMap<Passenger, String>();
    }
}
