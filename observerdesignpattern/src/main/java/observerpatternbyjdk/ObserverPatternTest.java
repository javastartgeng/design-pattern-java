package observerpatternbyjdk;

import java.util.Observable;

public class ObserverPatternTest {
    public static void main(String[] args) {
        //1.创建具体主题
        Observable subject = new SendMessageSubject();
        //2.注册观察者
        subject.addObserver(new SmsObserver());
        subject.addObserver(new MQObserver());
        //3.群发送消息
        subject.notifyObservers("hello world first observerPattern!");
    }
}
