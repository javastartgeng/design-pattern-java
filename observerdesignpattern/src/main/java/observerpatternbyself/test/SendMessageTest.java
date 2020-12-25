package observerpatternbyself.test;

import observerpatternbyself.observer.MQObserver;
import observerpatternbyself.observer.SmsObserver;
import observerpatternbyself.subject.SendMessageSubject;
import observerpatternbyself.subject.Subject;

public class SendMessageTest {
    public static void main(String[] args) {
        //1.创建具体主题
        Subject sendMessage = new SendMessageSubject();
        //2.注册观察者
        sendMessage.addObservers(new SmsObserver());
        sendMessage.addObservers(new MQObserver());
        //3.群发消息
        sendMessage.notifyObservers("hello world first observerPattern!");
    }
}
