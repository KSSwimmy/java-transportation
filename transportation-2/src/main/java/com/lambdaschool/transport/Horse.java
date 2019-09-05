package com.lambdaschool.transport;

public class Horse implements Vehicle, Animal

{
    //fields - is the state of the object of a class.
    // Fields is also the information that we need to know. (adjectives)

    private int fuel = 0;
    private String name;



    // constructor - We know it's a constructor because there is no datatype
    // you can have multiple constructors, but the parameter list has to be unique

    // fuel isn't in the constructor because it doesn't have to be.
    public Horse(String name)
    {
        this.name = name;
    }

    // default constructor is required in Spring. It does nothing but you can put params in it
    public Horse()
    {

    }

    // we're implementing the interface classes (Animal and Java) (copied and pasted the interface methods from Horse.java and Vehicle.java. Then we added the implementation requirements)
    @Override
    public void move() // There is a move() for both animal and vehicle. We only have to declare it once. The interface will use it once for both Animal and Vehicle.
    // If move() had a different parameter list (something in the parameter) then we would have to make two different implementations

    {
        fuel = fuel - 1;
    }

    @Override
     public void eat(int i)
    {
        fuel = fuel + i;
    }

    @Override
    public String speak()
    {
        return "Neigh";
    }

    @Override
    public String getPath()
    {
        return "Grass";
    }


    public void setName(String name)
    {
        this.name = name;
    }

    @Override
   public int getFuelLevel()
    {
        return fuel;
    }

    @Override
   public void addFuel(int i)
    {
        eat(i);
    }

}
