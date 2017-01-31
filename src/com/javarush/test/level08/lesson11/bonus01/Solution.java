package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String k = reader.readLine();

        Map<String, Integer> stringIntegerMap = new HashMap<>();

        stringIntegerMap.put("January", 1);
        stringIntegerMap.put("February", 2);
        stringIntegerMap.put("March", 3);
        stringIntegerMap.put("April", 4);
        stringIntegerMap.put("May", 5);
        stringIntegerMap.put("June", 6);
        stringIntegerMap.put("July", 7);
        stringIntegerMap.put("August", 8);
        stringIntegerMap.put("September", 9);
        stringIntegerMap.put("October", 10);
        stringIntegerMap.put("November", 11);
        stringIntegerMap.put("December", 12);


        for (Map.Entry<String, Integer> pair : stringIntegerMap.entrySet())
        {
            String key = pair.getKey();
            Integer value = pair.getValue();

            if (k.equals(key)) // первый раз, когда я делал, я по-моему приравнивал не через equals, а через обычное ==

            {
                System.out.println(key + " is " + value + " month");
            }


        }


    }

}
