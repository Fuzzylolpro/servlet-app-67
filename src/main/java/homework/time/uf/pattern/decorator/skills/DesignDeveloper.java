package homework.time.uf.pattern.decorator.skills;

import homework.time.uf.pattern.decorator.Decorator;
import homework.time.uf.pattern.decorator.Developer;

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
