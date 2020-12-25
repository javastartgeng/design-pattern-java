package observerpatternbyjdk;

import java.util.Observable;
import java.util.Observer;

public class MQObserver implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("发送MQ信息："+arg);
    }
}
