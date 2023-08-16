package homework.time.uf.pattern.adapter;

public class SmsSender implements Isender{
    @Override
    public void send(String text) {
        System.out.println("Отправляю сообщение: " + text);
    }
}
