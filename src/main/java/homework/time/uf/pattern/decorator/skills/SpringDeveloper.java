package homework.time.uf.pattern.decorator.skills;

import homework.time.uf.pattern.decorator.Decorator;
import homework.time.uf.pattern.decorator.Developer;

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
