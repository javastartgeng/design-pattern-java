package observerpatternbyjdk;

import java.util.Observable;

public class SendMessageSubject extends Observable {

    private String message;

    public SendMessageSubject(String message) {
        this.message = message;
    }
    public void notifyObservers(){
        setChanged();
        notifyObservers(message);
    }
}
