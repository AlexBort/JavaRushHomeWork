package com.javarush.test.level12.lesson09.task02;

/* Интерфейсы Fly, Run, Swim
Напиши public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавить в каждый интерфейс по одному методу.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public interface Fly
    {

        int fly(int speed);


    }

    public interface Run {
        int run (int speed);
    }

    public interface Swim {
        int swim_bath (String type_of_swim, int speed);
    }

}
