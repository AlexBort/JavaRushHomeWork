package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by User on 17.10.2016.
 */
public class Plane implements Flyable
{
    private int quantity;

    @Override
    public void fly()
    {

    }

    public Plane(int quantity)
    {
        this.quantity = quantity;
    }


}
