package com.javarush.test.level08.lesson06.task03;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка

Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/


public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Object> arrayList = new ArrayList<>();
        System.out.println("Получение времени для ArrayList: " + getTimeMsOfInsert(arrayList));

        LinkedList<Object> linkedList = new LinkedList<>();
        System.out.println("Получение времени для LinkedList: " + getTimeMsOfInsert(linkedList));
    }

    public static long getTimeMsOfInsert(List list)
    {


        // ===========================================================
        // почему таким методом оно мутит ноль в обоих случаях ?!?!?!
        Date date_current = new Date();
        Date date_count = new Date();
        long date_current_ = date_current.getTime();
        //напишите тут ваш код
        insert10000(list);
        long date_count_ = date_count.getTime();
        // ===========================================================


        long current = new Date().getTime();
        return new Date().getTime() - current;
        //напишите тут ваш код

    }

    public static void insert10000(List list)
    {
        for (int i = 0; i < 10000; i++)
        {
            list.add(0, new Object());
        }
    }
}
