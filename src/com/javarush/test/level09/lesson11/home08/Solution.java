package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут  массивы чисел.
  Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
  Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list_of_int_array = new ArrayList<>();

        int[] arr_5 = new int[5];
        for (int i = 0; i < arr_5.length; i++)
        {
            arr_5[i] = i;
        }

        int[] arr_2 = new int[2];
        for (int i = 0; i < arr_2.length; i++)
        {
            arr_2[i] = i;
        }

        int[] arr_4 = new int[4];
        for (int i = 0; i < arr_4.length; i++)
        {
            arr_4[i] = i;
        }

        int[] arr_7 = new int[7];
        for (int i = 0; i < arr_7.length; i++)
        {
            arr_7[i] = i;
        }

        int[] arr_0 = new int[0];
        for (int i = 0; i < arr_0.length; i++)
        {
            arr_0[i] = i;
        }


        list_of_int_array.add(arr_5);
        list_of_int_array.add(arr_2);
        list_of_int_array.add(arr_4);
        list_of_int_array.add(arr_7);
        list_of_int_array.add(arr_0);

        return list_of_int_array;

    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array : list)
        {
            for (int x : array)
            {
                System.out.println(x);
            }
        }
    }
}
