package com.javarush.test.level14.lesson02.task01;

/* Bingo
Исправь строчку 'Object o = new Pet();' в методе main так, чтобы программа вывела "Bingo!"
*/

public class Solution
{
    public static void main(String[] args)
    {
        Object o = new Tiger(); // если мы запишем более верхний класс, оно ничего не увидит,
        // а когда мы прописываем самый child, то прописівая  instanceof оно также видит родителей,
        // которые стоят над этим классом



        boolean isCat = o instanceof Cat;
        boolean isTiger = o instanceof Tiger;
        boolean isPet = o instanceof Pet;

        printResults(isCat, isTiger, isPet);
    }

    private static void printResults(boolean cat, boolean tiger, boolean pet)
    {
        if (cat && tiger && pet) System.out.println("Bingo!");
    }

    static class Pet
    {
    }

    static class Cat extends Pet
    {
    }

    static class Tiger extends Cat
    {
    }

}
