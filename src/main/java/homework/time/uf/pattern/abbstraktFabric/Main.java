package homework.time.uf.pattern.abbstraktFabric;

import homework.time.uf.pattern.abbstraktFabric.factors.FurnitureFactory;
import homework.time.uf.pattern.abbstraktFabric.factors.MetalFactory;
import homework.time.uf.pattern.abbstraktFabric.factors.WoodFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = getFabric("metal");
        System.out.println("This is you chair: " + factory.gatChair().getMaterial());
        System.out.println("This is you table: " + factory.gatTable().getMaterial());
        System.out.println("This is you bed: " + factory.gatBed().getMaterial());
    }

    public static FurnitureFactory getFabric(String material){
        return switch (material){
            case "metal"-> new MetalFactory();
            default -> new WoodFactory();
        };
    }
}
