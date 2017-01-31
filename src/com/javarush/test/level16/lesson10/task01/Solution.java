package com.javarush.test.level16.lesson10.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* Считаем секунды
1. Напиши реализацию метода run в нити Stopwatch (секундомер).
2. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
3. Выведи количество секунд в консоль.
*/


// Thread.sleep()- нить засыпает на некоторое время
// Thread.join()- другие потоки ожидают, пока
// остановить саму нить мы не можем. Но можем thread запихнуть в какой-то while(true), в котором, если необходимая задача выполнилась,
// тогда булевское значение становится false, и просто while(true) прекращает свою работу...соответственно и нить перестает работать!

// interrupt()- отменяет нить
// isInterrupted()- проверяет, остановлена ли нить
// Для завершения метода блокирования нужно намного больше времени, нежели для других методов класса Thread.
//


public class Solution
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();

        //read a string
        reader.readLine();
        stopwatch.interrupt();

        //close streams
        reader.close();
        in.close();

    }

    public static class Stopwatch extends Thread
    {
        private int seconds;

        public void run()
        {
            try
            {
                while (true)
                {
                    Thread.sleep(1000);
                    seconds += 1;
                }
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
                System.out.println(seconds);
            }
        }
    }
}
