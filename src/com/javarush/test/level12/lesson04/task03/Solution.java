package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static void print (String k, String l) {
        System.out.println(k+l);
    }

    public static void print (int k, int l) {
        System.out.println(k+l);
    }
    public static void print ( int l) {
        System.out.println(l);
    }

    public static void print (int k, String l) {
        System.out.println(k);
    }
    public static void print (String l,  int k) {
        System.out.println(k + l);
    }

}
