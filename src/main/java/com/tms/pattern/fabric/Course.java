package com.tms.pattern.fabric;

public abstract class Course {
    public Developer developer;

    public Course() {
        this.developer = createDeveloper();
    }
    void courseDescription(){
        System.out.println("Вы будете учить"+ developer.getLangue() +"язык");
        developer.makeCode();
    }
    public abstract Developer createDeveloper();
}
