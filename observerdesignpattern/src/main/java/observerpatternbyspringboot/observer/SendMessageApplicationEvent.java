package observerpatternbyspringboot.observer;

import org.springframework.context.ApplicationEvent;

public class SendMessageApplicationEvent extends ApplicationEvent {
    private String message;
    public SendMessageApplicationEvent(Object source,String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
