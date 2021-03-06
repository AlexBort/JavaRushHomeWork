package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date) throws ParseException
    {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.US);

        Date parsed = simpleDateFormat.parse(date);
        int year = parsed.getYear();
        int monthe = parsed.getMonth();

        long msDay = 24 * 60 * 60 * 1000;

        Date date1 = new Date();
        date1.setYear(year);
        date1.setMonth(0);
        date1.setDate(0);
        date1.setHours(0);
        date1.setMinutes(0);
        date1.setSeconds(0);
        long atLast = (parsed.getTime() - date1.getTime()) / msDay+1;
        System.out.println(atLast);
        if (atLast % 2 == 0) return false;
        else return true;

    }
}
