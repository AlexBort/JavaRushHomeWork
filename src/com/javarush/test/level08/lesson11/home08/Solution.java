package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }



            public static void sort(int[] array)
    {
        for (int i2=0; i2<array.length; i2++)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                int temp = 0;
                if (array[i] < array[i + 1])
                {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    if (i > 0) i--;
                }
            }
        }
    }

    // ХОТЯ ТО, КАК Я ДЕЛАЛ СОРТИРОВКУ ТОЖЕ ПРАВИЛЬНО!!
    /* public static void sort(int[] array)
    {

        int temp, max;
       for (int i=0; i<array.length-1;i++) {
          max=i;

           for (int j=i+1;j<array.length;j++) {

               if (array[j]>array[max]) {max=j;}
              temp = array[i];
              array[i]=array[max];
               array[max]=temp;
           }
       }
    }*/


               // if, while

               // берутся соседние числа, и меньшее идет влево, а большее вправо
               // делается сортировка до тех пор, пока полностью не будет произведене сортировка

               // мне по сути надо сортировать от большего до меньшего - 1)
               // по-сути мне надо выделить только 5 наибольших и все
               // мб пузырек не подойдет




}
