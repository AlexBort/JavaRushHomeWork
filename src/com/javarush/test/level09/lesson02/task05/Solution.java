package com.javarush.test.level09.lesson02.task05;

/* Метод должен возвращать результат – глубину его стек-трейса
Написать метод, который возвращает результат –
 глубину его стек трейса – количество методов в нем (количество элементов в списке).
 Это же число метод должен выводить на экран.

*/

public class Solution
{
    public static int count = 0;

    public static int getStackTraceDeep()
    {


        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            count++;
        }
        System.out.println(count);
        return count;
    }




    /*public static Integer k;

    public static int getStackTraceDeep()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            k = Integer.parseInt(String.valueOf(element));

        }
        System.out.println(k);
        return k;


    }*/


}