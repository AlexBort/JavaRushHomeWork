package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

import java.io.InputStream;

public class Solution {

    // public
    // default
    // protected


    public Solution () {}
    public Solution (String k) {}
    public Solution (Integer integer) {}

    Solution (int k) {}
    Solution (int k, int l) {}
    Solution (int l, int k, String qwerty) {}

    protected Solution (Double aDouble) {}
    protected  Solution (Short aShort) {}
    protected Solution (double k) {}

    private Solution(Boolean a1){}
    private Solution(boolean a2){}
    private Solution(String a3, String l){}

}

