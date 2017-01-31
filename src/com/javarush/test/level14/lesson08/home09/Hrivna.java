package com.javarush.test.level14.lesson08.home09;

/**
 * Created by User on 09.09.2016.
 */
public class Hrivna extends Money
{


    public Hrivna(double amount)
    {
        super(amount);
    }

    @Override
    public double getAmount()
    {
        return 0;
    }

    @Override
    public String getCurrencyName()
    {
        return "HRN";
    }
}
