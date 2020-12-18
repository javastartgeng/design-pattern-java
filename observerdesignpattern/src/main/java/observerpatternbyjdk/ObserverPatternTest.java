package observerpatternbyjdk;

public class ObserverPatternTest {
    public static void main(String[] args) {
        //1.创建主题
        SendMessageSubject subject = new SendMessageSubject("hello world first observerPattern!");
        //2.创建观察者
        new SmsObserver(subject);
        new MQObserver(subject);
        //3.发送消息
        subject.notifyObservers();
    }
}
