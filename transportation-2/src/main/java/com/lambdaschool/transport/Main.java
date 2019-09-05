package com.lambdaschool.transport;

import java.util.*;

public class Main
{
    //psvm (hotkey for "public static void main)
    public static void main(String[] args)
    {
        Horse seabiscuit = new Horse("Seabiscuit");
        Horse affirmed = new Horse("Affirmed");
        Horse joe = new Horse("Joe");

        seabiscuit.eat(10);
        affirmed.eat(25);
        seabiscuit.move();
        seabiscuit.move();
        seabiscuit.move();

        System.out.println("Seabiscuit's fuel level" + seabiscuit.getFuelLevel());

    }
}
