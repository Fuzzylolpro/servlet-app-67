package homework.time.uf.pattern.adapter;

public class Adapter extends TelegramLogic implements Isender{
    /*TelegramLogic telegramLogic = new TelegramLogic();*/
    @Override
    public void send(String text) {
        sendingMassageToUser(text);
    }
}
