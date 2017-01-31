package com.javarush.test.level08.lesson03.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Коллекция HashMap из котов
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        HashMap<String, Cat> map = addCatsToMap(cats);

      //  Iterator <HashMap.Entry<String,Cat>> iterator = map.entrySet().iterator();

        for (Map.Entry<String, Cat> pair : map.entrySet())
        {


            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats)
    {

        HashMap<String, Cat> adCats = new HashMap<String, Cat>();

        for (String s : cats){
            adCats.put(s, new Cat(s));
        }
        return adCats;


        // возможен ли такой вариант ?!?!
        /*Cat cat = new Cat("cat");

        addCatsToMap(cats).put("васька", cat);
        addCatsToMap(cats).put("мурка", cat);
        addCatsToMap(cats).put("дымка", cat);
        addCatsToMap(cats).put("рыжик", cat);
        addCatsToMap(cats).put("серый", cat);
        addCatsToMap(cats).put("снежок", cat);
        addCatsToMap(cats).put("босс", cat);
        addCatsToMap(cats).put("борис", cat);
        addCatsToMap(cats).put("визя", cat);
        addCatsToMap(cats).put("гарфи", cat);*/
        //напишите тут ваш код

    }


    public static class Cat
    {
         String  name;

        public Cat(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return name != null ? name.toUpperCase() : null; // что здесь означает знак вопроса и двоеточие ?!?! узнать у Мишани?!
        }
    }
}
