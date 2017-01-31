package com.javarush.test.level08.lesson03.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Вывести на экран список значений
Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки.
*/

public class Solution
{


    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }


    public static void printValues(Map<String, String> map)
    {
        // iterator не дал мне возможности прогнать все это дело по порядку, поэтому я
        // не вижу отличий между прогонкой for_each и прогонкой через итератор!
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();

            System.out.println(pair.getValue());
        }
    }


    /*// ЭТО В ПРИНЦИПЕ ПРАВИЛЬНЫЙ МЕТОД
    public static void printValues(Map<String, String> map)
    {
        for (HashMap.Entry<String,String> pair: map.entrySet())
        {
            System.out.println(pair.getValue());
        }
    }*/

}
