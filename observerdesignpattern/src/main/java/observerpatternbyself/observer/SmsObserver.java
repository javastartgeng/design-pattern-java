package observerpatternbyself.observer;

public class SmsObserver implements Observer{
    @Override
    public void update(Object args) {
        System.out.println("发送短信消息："+args);
    }
}
