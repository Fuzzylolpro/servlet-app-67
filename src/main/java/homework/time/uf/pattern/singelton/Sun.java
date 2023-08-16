package homework.time.uf.pattern.singelton;

public class Sun {
    private String color;
    private static Sun sun;
    //1. ограничить базовое создание


    @Override
    public String toString() {
        return "Sun{" +
                "color='" + color + '\'' +
                '}';
    }

    private Sun(String color) {
        this.color = color;
    }

    public static Sun makeInstance(String color){
        if (sun == null){
            sun = new Sun(color);
        }
            return sun;
    }
}
