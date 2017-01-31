package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    // этот метод дает возможность найти минимальное число в List-е
    public static int getMinimum(List<Integer> array) {

        int min = Integer.parseInt(String.valueOf(Collections.min(array))); // здесь вручную не прописывается поиск минимального числа,
        // а просто используется  метод класса Collections

        return min;
    }

    // этот метод создает List, который формируется введением с клавиатуры пользователем
    public static List<Integer> getIntegerList() throws IOException {

        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        for (int i=0; i<N;i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        //create and initialize a list here - создать и заполнить список тут
        return list;

    }
}
