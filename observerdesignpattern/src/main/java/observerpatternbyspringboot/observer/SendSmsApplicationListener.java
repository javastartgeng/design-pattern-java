package observerpatternbyspringboot.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SendSmsApplicationListener implements ApplicationListener<SendMessageApplicationEvent> {
    @Override
    public void onApplicationEvent(SendMessageApplicationEvent sendMessageApplicationEvent) {
        System.out.println("发送短信信息："+sendMessageApplicationEvent.getMessage());
    }
}
