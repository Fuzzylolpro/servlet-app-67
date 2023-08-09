package com.tms.pattern.decorator;

import com.tms.pattern.decorator.skills.DesignDeveloper;
import com.tms.pattern.decorator.skills.SpringDeveloper;
import com.tms.pattern.decorator.skills.TestDeveloper;

public class Main {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        SpringDeveloper springDeveloper = new SpringDeveloper(javaDeveloper);
        DesignDeveloper designDeveloper = new DesignDeveloper(springDeveloper);
        TestDeveloper testDeveloper = new TestDeveloper(designDeveloper);
        testDeveloper.showSkill();
    }
}
