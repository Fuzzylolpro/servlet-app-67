package com.tms.pattern.fabric;

public class СplusDeveloper implements Developer {
    @Override
    public void makeCode() {
        System.out.println("Пишу код C++");
    }

    @Override
    public String getLangue() {
        return "C++";
    }
}
