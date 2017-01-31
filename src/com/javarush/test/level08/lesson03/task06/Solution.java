package com.javarush.test.level08.lesson03.task06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Коллекция HashMap из Object
Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
Sim - 5
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // мы наполнили HashMap определенными данными
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double)123);


        // эта строчка в реальности даже не нужна была, хотя они ее сюда поставили, или это я уже ее кинул сюда
     //   Iterator<Map.Entry<String,Object>> iterator = (Iterator<Map.Entry<String, Object>>) map.entrySet();

        // прогнать мне надо весь меп для того, чтобы вывести каждый элемент с новой строчки!
        for (Map.Entry<String,Object> pair: map.entrySet())
        {
            // entrySet() помогает получить ключ-значение Map-a
            System.out.println(pair.getKey() + " - " + pair.getValue());

        }
        //напишите тут ваш код

    }
}
