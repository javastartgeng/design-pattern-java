package observerpatternbyjdk;

import java.util.Observable;

public class SendMessageSubject extends Observable {

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }
}
