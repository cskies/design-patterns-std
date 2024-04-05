package org.example;

import org.example.creational.ClassSingleton;

public class Main {
    public static void main(String[] args) {
        var single = ClassSingleton.getInstance();
        var single2 = ClassSingleton.getInstance();
        System.out.println(single2.getInfo());
    }
}