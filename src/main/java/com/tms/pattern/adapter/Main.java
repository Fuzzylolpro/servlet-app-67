package com.tms.pattern.adapter;

public class Main  {
    public static void main(String[] args) {
        Isender sender = new Adapter();
        sender.send("Адптер легкий патерн!!");

    }
}
