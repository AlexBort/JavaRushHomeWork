package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу
: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{


   /* public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Bortnik", new Date("AUGUST 17 1994"));
        map.put("kOLOSOW", new Date("AUGUST 1 1993"));
        map.put("rED", new Date("AUGUST 1 1991"));
        map.put("Msrchuck", new Date("AUGUST 13 1994"));

        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Bortnik", new Date("AUGUST 17 1994"));
        map.put("kOLOSOW", new Date("AUGUST 1 1993"));
        map.put("rED", new Date("AUGUST 1 1991"));
        map.put("Msrchuck", new Date("AUGUST 13 1994"));
        //напишите тут ваш код

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        for (Map.Entry<String, Date> lastname_date : map.entrySet())
        {
            //  String name = lastname_date.getKey();
            String date = String.valueOf(lastname_date.getValue());

            Date june = new Date();
            Date july = new Date();
            Date august = new Date();
            june.setMonth(5);
            july.setMonth(6);
            august.setMonth(7);

            if (date.equals(june) & date.equals(july) & date.equals(august))
            {
                map.remove(lastname_date);
            }
        }


    }*/



        public static HashMap<String, Date> createMap()
        {
            HashMap<String, Date> map = new HashMap<String, Date>();
            map.put("Сталлоне", new Date("JUNE 1 1980"));
            map.put("Сталин", new Date("JUNE 1 1980"));
            map.put("Батистута", new Date("JUNE 1 1980"));
            map.put("Матиз", new Date("SEPTEMBER 1 1980"));
            map.put("Борис", new Date("FEBRUARY 1 1980"));
            map.put("Новел", new Date("MARCH 1 1980"));
            map.put("Виолла", new Date("MAY 1 1980"));
            map.put("Шокин", new Date("MAY 1 1980"));
            map.put("Феликс", new Date("JUNE 1 1980"));
            map.put("Эдмунд", new Date("JUNE 1 1980"));

            return map;

        }

        public static void removeAllSummerPeople(HashMap<String, Date> map)
        {
            Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

            while (iterator.hasNext())
            {
                int month = iterator.next().getValue().getMonth() + 1;
                if (6 <= month && month <= 8)
                {
                    iterator.remove();
                }
            }

        }
        public static void main(String[] args)
        {
            HashMap<String, Date> wasBorn = createMap();
            removeAllSummerPeople(wasBorn);
            System.out.println(wasBorn);
        }

    }
