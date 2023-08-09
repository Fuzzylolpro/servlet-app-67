package com.tms.pattern.adapter;

public class SmsSender implements Isender{
    @Override
    public void send(String text) {
        System.out.println("Отправляю сообщение: " + text);
    }
}
