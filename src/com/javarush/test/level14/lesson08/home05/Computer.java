package com.javarush.test.level14.lesson08.home05;

/**
 * Created by User on 03.10.2016.
 */
public class Computer
{
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public Monitor getMonitor()
    {
        return monitor;
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Computer()
    {
        this.monitor = new Monitor();
        this.keyboard = new Keyboard();
        this.mouse = new Mouse();
    }






    /*9. Создай конструктор в классе Computer используя комбинацию клавиш Alt+Insert внутри класса (команда Constructor).
10 Внутри конструктора инициализируйте все три поля (переменных) класса
11. Создай геттеры для полей класса Computer (в классе используй комбинацию клавиш Alt+Insert и выбери команду Getter).
12. Все созданные классы и интерфейс должны быть в отдельных файлах.*/


}
