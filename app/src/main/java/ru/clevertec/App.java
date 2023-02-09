package ru.clevertec;

import ru.clevertec.core.Utils;

public class App {
    static String [] massInt = {"1","2","23","3","4","4","5","21","3","25", "-2", "-3", "3"};
    public static void main(String[] args) {
        System.out.print("isAllPositiveNumbers (");
        for (String s: massInt) {
            System.out.print (s + " ");
        }
        System.out.println( ") = "+ Utils.isAllPositiveNumbers(massInt));
    }
}

