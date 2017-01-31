package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }



    public static class Human
    {
        int age;
        int weight;
        int height;

        String name;
        String sex;
        String type;


    public Human (String name) {
    this.name=name;
    }

        // 1
        public Human (String name, int age) {
            this.age=age;
            this.name=name;
        }

        // 2
        public Human (String name, int age, int height) {
            this.age=age;
            this.name=name;
            this.height=height;
        }

        // 3
        public Human (String name, int age, int height, int weight) {
            this.age=age;
            this.name=name;
            this.height=height;
            this.weight=weight;
        }

        // 4
        public Human ( int age, int height, int weight) {
            this.age=age;

            this.height=height;
            this.weight=weight;
        }


        // 5
        public Human (String name, int age, int height, int weight, String type, String sex) {
            this.age=age;
            this.name=name;
            this.height=height;
            this.weight=weight;
            this.sex=sex;
            this.type=type;

        }


        // 6
        public Human (String name, int age, int height, int weight,  String sex) {
            this.age=age;
            this.name=name;
            this.height=height;
            this.weight=weight;
            this.sex=sex;

        }

        // 7
        public Human (String name, int age, int weight, String type) {
            this.age=age;
            this.name=name;

            this.weight=weight;

            this.type=type;

        }

        // 8
        public Human ( int weight, String type, String sex) {

            this.weight=weight;
            this.sex=sex;
            this.type=type;

        }


        // 9
        public Human (int age,  String sex) {
            this.age=age;
            this.sex=sex;

        }

        // 10
        public Human (String name, String sex) {
            this.name=name;
            this.sex=sex;

        }

    }


}
