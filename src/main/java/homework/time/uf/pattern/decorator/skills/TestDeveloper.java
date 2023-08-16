package homework.time.uf.pattern.decorator.skills;

import homework.time.uf.pattern.decorator.Decorator;
import homework.time.uf.pattern.decorator.Developer;

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
