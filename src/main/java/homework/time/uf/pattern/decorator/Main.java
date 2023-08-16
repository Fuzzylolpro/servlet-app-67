package homework.time.uf.pattern.decorator;

import homework.time.uf.pattern.decorator.skills.DesignDeveloper;
import homework.time.uf.pattern.decorator.skills.SpringDeveloper;
import homework.time.uf.pattern.decorator.skills.TestDeveloper;

public class Main {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        SpringDeveloper springDeveloper = new SpringDeveloper(javaDeveloper);
        DesignDeveloper designDeveloper = new DesignDeveloper(springDeveloper);
        TestDeveloper testDeveloper = new TestDeveloper(designDeveloper);
        testDeveloper.showSkill();
    }
}
