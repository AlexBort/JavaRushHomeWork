package com.javarush.test.level10.lesson04.task01;

/* Задача №1 на преобразование целых типов
Расставьте правильно операторы приведения типа, чтобы получился ответ: d > 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b);
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a = 0;

        int b = (byte) a + 46; // приблавление байтового 0 + интовое число
       // System.out.println(b);
        byte c = (byte) (a*b); // потом эти два числа становятся байтовыми
    //    System.out.println(c); // умножение 2-х байтов-- самых малых типов переменных.... ответ: 0.

        double f = (float) 1234.15; // появляется новая переменная- типа double, которая суажается до float

    //    System.out.println(f);
        long d = (int) (a + f / c + b); // создаем новую переменную с новым типлм
        // (самое длинное целое число) и сужаем до инта

        System.out.println(d);


    }
}
