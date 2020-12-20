package observerpatternbyself.observer;

public class MQObserver implements Observer{
    @Override
    public void update(Object args) {
        System.out.println("发送mq消息："+args);
    }
}
