package observerpatternbyspringboot.controller;


import observerpatternbyspringboot.observer.SendMessageApplicationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/msg")
    @ResponseBody
    public String sendMsg(){
        SendMessageApplicationEvent event = new SendMessageApplicationEvent(this,"hello world first observerpattern!");
        applicationContext.publishEvent(event);
        return "success";
    }
}
