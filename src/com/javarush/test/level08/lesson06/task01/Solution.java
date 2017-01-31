package com.javarush.test.level08.lesson06.task01;

import java.util.*;

/* Создать два списка LinkedList и ArrayList
Нужно создать два списка – LinkedList и ArrayList.
*/

public class Solution
{



    public static Object createArrayList()
    {
       ArrayList <Object>  arrayList = new ArrayList<>(); // легко сетить и гетить, но сложно запихивать всередину

        return arrayList;
    }

    public static Object createLinkedList()
    {
       /*  Linked работает таким образом: когда мы впихиваем элемент всередину, каждый элемент
         в свою очередь имеет ссылки соседних элементов, поэтому им надо просто поменяться местами*/

        // ArrayList-у же приходится смещать все элементы на один, чтобы сделать это вставляние в середину

        LinkedList <Object> linkedList = new LinkedList<>();

        return linkedList;
    }
}
