package com.tms.pattern.singelton;

public class Main {
    public static void main(String[] args) {
        Sun sunFirst = Sun.makeInstance("Red");
        Sun sunSecond = Sun.makeInstance("Yellow");

        System.out.println(sunFirst);
        System.out.println(sunSecond);
    }
}
