package flight.fachwerte;

public final class Plane
{
    private final int _id;
    private final String _brand;
    private final String _model;
    private final int _capacity;

    public Plane(int id, String brand, String model, int capacity)
    {
        _id = id;
        _brand = brand;
        _model = model;
        _capacity = capacity;
    }

    public int getId()
    {
        return _id;
    }

    public String getBrand()
    {
        return _brand;
    }

    public String getModel()
    {
        return _model;
    }

    public int getCapacity()
    {
        return _capacity;
    }
}
