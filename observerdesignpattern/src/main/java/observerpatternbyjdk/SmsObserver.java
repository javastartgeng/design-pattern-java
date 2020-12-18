package observerpatternbyjdk;

import java.util.Observable;
import java.util.Observer;

public class SmsObserver implements Observer {

    public SmsObserver(SendMessageSubject subject){
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("发送短信息："+arg);
    }
}
