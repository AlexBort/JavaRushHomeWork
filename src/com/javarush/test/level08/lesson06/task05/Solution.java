package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

 /*Четыре метода
Реализовать 4 метода.
 Они должны возвращать список, который
 лучше всего подходит для выполнения данных операций
 (быстрее всего справится с большим количеством операций).
  Ничего измерять не нужно.
*/


public class Solution


{

    // LinkedList.add - одинаково обое

    public static List getListForGet()
    {
        ArrayList<Object> arrayList = new ArrayList();

        for (int i = 0; i < arrayList.size(); i++)
        {
            arrayList.get(i);
        }
        //напишите тут ваш код

        return arrayList;
    }

    public static List getListForSet()
    {
        ArrayList<Object> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList2.size(); i++)
        {
            arrayList2.set(i, new Object());
        }
        return arrayList2;
        //напишите тут ваш код

    }

    public static List getListForAddOrInsert()
    {

        LinkedList<Object> linkedList = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++)
        {
            linkedList.add(i, new Object());
        }
        //напишите тут ваш код
        return linkedList;
    }

    public static List getListForRemove()
    {
        LinkedList<Object> linkedList = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++)
        {
            linkedList.remove(i);
        }

        // remove - LinkedList
        //напишите тут ваш код
        return linkedList;
    }
}
