package com.lambdaschool.transport;

public class HorseFromVehicle extends AbstractVehicle // HorseFromVehicle is inheriting from AbstractVehicle
{
    private String name;

    // default constructor is required in Spring. It does nothing but you can put params in it
    public HorseFromVehicle()
    {

    }

    public HorseFromVehicle(String name, int fuel)
    {
        super(fuel);
        this.name = name;
    }

    public HorseFromVehicle(String name)
    {
        this.name = name;
    }

    // implementing the methods from AbstractVehicle
    @Override
    public String getPath()
    {
        return "Grass";
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "HorseFromVehicle{" + "name='" + name + '\'' + ", fuel=" + fuel + '}';
    }
}
