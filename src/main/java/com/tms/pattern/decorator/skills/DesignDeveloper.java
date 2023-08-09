package com.tms.pattern.decorator.skills;

import com.tms.pattern.decorator.Decorator;
import com.tms.pattern.decorator.Developer;

public class DesignDeveloper extends Decorator {
    public DesignDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public void showSkill() {
        super.showSkill();
        System.out.println("I can make code design...");
    }
}
