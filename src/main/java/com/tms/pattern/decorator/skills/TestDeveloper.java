package com.tms.pattern.decorator.skills;

import com.tms.pattern.decorator.Decorator;
import com.tms.pattern.decorator.Developer;

public class TestDeveloper extends Decorator {
    public TestDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public void showSkill() {
        super.showSkill();
        System.out.println("Can write come tests ...");
    }
}
