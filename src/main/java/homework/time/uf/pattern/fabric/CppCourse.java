package homework.time.uf.pattern.fabric;

public class CppCourse extends Course{
    @Override
    public Developer createDeveloper() {
        return new СplusDeveloper();
    }
}
