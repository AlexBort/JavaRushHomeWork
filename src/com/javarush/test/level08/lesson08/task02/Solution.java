package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> integerSet = new HashSet<>();
        /*integerSet.add(5);
        integerSet.add(15);
        integerSet.add(45);
        integerSet.add(3);
        integerSet.add(1);
        integerSet.add(7);
        integerSet.add(16);
        integerSet.add(8);
        integerSet.add(9);
        integerSet.add(10);
        integerSet.add(11);

        integerSet.add(13);
        integerSet.add(45);
        integerSet.add(345);
        integerSet.add(14);
        integerSet.add(657);
        integerSet.add(343);
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(2);*/

        for (int i=0; i<20; i++) {
            integerSet.add(i);
        }

         removeAllNumbersMoreThan10( integerSet); // почему то эта строчка не нужна для компиляции

        //напишите тут ваш код


        return  integerSet; // оно сначала не хотело так просто возвращать,
        // потому что мы хотели вернуть интерфейс (Set, а не HashSet), а не объект обычного класса
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator <Integer> integerIterator = set.iterator();
        while (integerIterator.hasNext()) {
            Integer chislo = integerIterator.next();
            if (chislo>10) {
                integerIterator.remove();
            }

        }

        //напишите тут ваш код

        return set;
    }
}
