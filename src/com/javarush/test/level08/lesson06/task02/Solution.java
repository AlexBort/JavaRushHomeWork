package com.javarush.test.level08.lesson06.task02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Провести 10 тысяч вставок, удалений
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // ArrayList
        ArrayList arrayList  = new ArrayList();
        insert10000(arrayList); // add
        get10000(arrayList);    // get
        set10000(arrayList);    // set
        remove10000(arrayList); // remove

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    // List list - это реально абстракция, а точнее интерфейс, который можно будет использовать, и в LinkedList, и в ArrayList
    public static void insert10000(List  list)
    {
        for (int i=0; i<10000; i++) { // почему 1000, если начинается с 0, тоесть тогда здесь 1001 элемент?!
            list.add(new Object()); // а почему new Object ???!?!?!
            // new Object наверное потому что я пихаю элементы не на те же позиции, а все кидаю в конец списка!
            // add добавляет значение в вообще новые ячейки, в отличии от сета,
            // который устанавливает значения в уже фиксированне позиции
        }

    }

    public static void get10000(List list)
    {
       for (int i=0; i<10000; i++ ) {
           list.get(i);
       }

    }

    public static void set10000(List list)
    {
       for (int i=0; i<10000; i++) {
           list.set(i, new Object());
       }

    }

    public static void remove10000(List list)
    {
        for (int i=0; i<10000; i++)
        {
            list.remove(0); // почему 0, если надо удалить 10000 элементов ?
        }
    }
}
