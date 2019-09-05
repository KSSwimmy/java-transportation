package com.lambdaschool.transport;

// Abstract classes are used for any Vehicle that is created and it must have these items in it. It will then be *extended* to HorseFromVehicle.
// Abstract class is the parent of whatever class that extends from it. In this case HorseFromVehicle.

public abstract class AbstractVehicle // You can not instantiate an object of this class because it is an abstract class.
{
    private  int fuel;

    // default constructor is required in Spring. It does nothing but you can put params in it
    public AbstractVehicle()
    {

    }

    public AbstractVehicle(int fuel) // we're bringing this constructor into HorseFromVehicle by the super keyword
    {
        this.fuel = fuel;
    }

    public abstract String getPath();
    public abstract String getName();

    public void move()
    {
        fuel--;
    }
    public void move(int steps)
    {
        fuel = fuel - steps;
    }

    public int getFuelLevel()
    {
        return fuel;
    }

    public void addFuel(int i)
    {
        fuel ++;
    }


}
