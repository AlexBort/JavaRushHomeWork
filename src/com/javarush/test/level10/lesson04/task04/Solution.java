package com.javarush.test.level10.lesson04.task04;

/* Задача №4 на преобразование целых типов
Добавить одну операцию по преобразованию типа, чтобы получался ответ: nine=9
short number = 9;
char zero = '0';
int nine = (zero + number);
*/

public class Solution
{
    public static void main(String[] args)
    {


        // ТАК ОНО ТОЖЕ РАБОТАЕТ!!!
     /*   short number = 9;

        char zero = '0';


        char nine = (char) (zero + number);
        System.out.println(nine);*/

        short number = 9;
        //char zero1 = '0';
        //int zero = Character.getNumericValue(zero1);
        char zero = '0';
        int nine = (zero + number);

        System.out.println((char)nine);
    }
}
