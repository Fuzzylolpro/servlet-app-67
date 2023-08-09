package com.tms.pattern.decorator.skills;

import com.tms.pattern.decorator.Decorator;
import com.tms.pattern.decorator.Developer;

public class SpringDeveloper extends Decorator {
    public SpringDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public void showSkill() {
        super.showSkill();
        System.out.println("We can make some work with Spring...");
    }
}
