package com.javarush.test.level10.lesson11.home03;

/* Правильный ответ: d=1.0
Добавить одну операцию по преобразованию типа, чтобы получался ответ: d=1.0.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte) a + b/c/e; // внатуре, мне надо было привести к самому малому типу, чтобы получилось такое малое число

        System.out.println(d);
    }
}
