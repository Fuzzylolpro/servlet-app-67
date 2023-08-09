package com.tms.pattern.fabric;

public class JavaCourse extends Course{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
