package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода,
 вызвавшего его, полученное с помощью StackTrace.
*/


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        System.out.println(meth);
        return meth;
    }

    public static String method2()
    {
        method3();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        System.out.println(meth);
        return meth;

    }

    public static String method3()
    {
        method4();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        System.out.println(meth);
        return meth;

    }

    public static String method4()
    {
        method5();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName(); // то на самом деле он вызывает имя своего метода, а не тот, который его вызвал ?!?!
        // почему нельзя было итератором воспользоваться (for_each) ??
        System.out.println(meth); // разве оно говорило, чтобы я выводил ? оно говорило только про возврат значения
        // и почему порядок в массиве именно 2, точнее это третий элемент массива ?!?!
        return meth;

    }

    public static String method5()
    {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        System.out.println(meth);
        return meth;

    }
}




                    // ========>>>> ПОЧЕМУ МОЯ ВЕРСИЯ ПЛОХАЯ!!!
/*public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }


    public static String method1()
    {
        method2();
        return method2();

    }

    public static String method2()
    {
        method3();
        return method3();
        //напишите тут ваш код

    }

    public static String method3()
    {
        method4();
        return method4();
        //напишите тут ваш код

    }

    public static String method4()
    {

        method5();
        return method5();
        //напишите тут ваш код

    }

    public static String method5()
    {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();

        for (StackTraceElement element : stackTraceElement)
        {
            element.getMethodName();
        }

        return method5();

    }
}*/

/*1) вызывают друг друга
 2) Каждый метод должен возвращать имя метода, вызвавшего его*/
