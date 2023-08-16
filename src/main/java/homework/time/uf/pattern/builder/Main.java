package homework.time.uf.pattern.builder;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder().cost(100).color("White").build();
        System.out.println(house);
    }
}
