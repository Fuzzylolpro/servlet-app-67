package com.tms.pattern.fabric;

public class CppCourse extends Course{
    @Override
    public Developer createDeveloper() {
        return new СplusDeveloper();
    }
}
