package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        HashMap <String,String> name_surname = new HashMap<>();
        name_surname.put("Федор", "Достоевский"); // 1
        name_surname.put("Федор", "Браилов");
        name_surname.put("Петя", "Браилов");
        name_surname.put("Петя", "Коваленко");
        name_surname.put("Колян", "Коваленко"); // 5
        name_surname.put("Колян", "Прохоров");
        name_surname.put("Фредерик", "Прохоров");
        name_surname.put("Фредерик", "Мвандамена");
        name_surname.put("Шафик", "Мвандамена");
        name_surname.put("Прут", "Шакур");

        return name_surname;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
