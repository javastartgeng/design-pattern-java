package observerpatternbyspringboot.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SendMQApplicationListener implements ApplicationListener<SendMessageApplicationEvent> {
    @Override
    public void onApplicationEvent(SendMessageApplicationEvent sendMessageApplicationEvent) {
        System.out.println("发送mq信息："+sendMessageApplicationEvent.getMessage());
    }
}
