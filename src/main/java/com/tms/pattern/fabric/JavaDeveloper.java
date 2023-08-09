package com.tms.pattern.fabric;

public class JavaDeveloper implements Developer{
    @Override
    public void makeCode() {
        System.out.println("Пишу код JAva");
    }

    @Override
    public String getLangue() {
        return "Java";
    }
}
