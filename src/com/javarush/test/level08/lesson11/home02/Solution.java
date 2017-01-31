package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/



public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {

        // он сделал без всякого for-a, просто вручную добавил столько котов, сколько нужно
        Set<Cat> result = new HashSet<Cat>();

        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs()
    {
        Set<Dog> resultD = new HashSet<Dog>();
        resultD.add(new Dog());
        resultD.add(new Dog());
        resultD.add(new Dog());

        return resultD;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        Set<Object> pets = new HashSet<Object>();

        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets)
    {
        // print он сделал через for_each + добавил еще один sout
        for (Object pet : pets)
        {
            System.out.println(pet);
        }

        System.out.println();
    }

    public static class Cat
    {

    }

    public static class Dog
    {

    }


}

/*
public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>(4);

        for (int i=0; i<4; i++) {
            result.add(new Cat());
        }
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs()
    {

        HashSet <Dog> dogs = new HashSet<>();
        for (int i=0; i<3; i++) {dogs.add(new Dog());
        }


        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
       HashSet <Object> objects = new HashSet<>();
        objects.add(cats);
        objects.add(dogs);
        return objects;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        pets.remove(cats);
    }

    public static void printPets(Set<Object> pets)
    {
        System.out.println(pets);

    }

    public static class Cat {}
    public static  class Dog {}
}
*/
