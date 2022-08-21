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

    @Override
    public int hashCode()
    {
        int base = 15;
        return base * Integer.parseInt(_brand) + Integer.parseInt(_model)
                + _capacity;
    }

    private boolean equals(Plane other)
    {
        return (this._brand.equals(other._brand)
                && this._model.equals(other._model)
                && this._capacity == other._capacity);
    }

    @Override
    public String toString()
    {
        return "Brand: " + _brand + "\n" + "Model: " + _model + "\n"
                + "Capacity: " + _capacity + "Passengers";
    }

}
