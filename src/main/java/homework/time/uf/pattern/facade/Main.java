package homework.time.uf.pattern.facade;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.copyInfoFromCdDiskToHardDisk();
        System.out.println(computer.getHardDisk());
    }
}
