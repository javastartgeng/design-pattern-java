package strategydesignpattern.strategydesginpatternspringboot.payImpl;

import org.springframework.stereotype.Component;
import strategydesignpattern.strategydesginpatternspringboot.pay.Pay;

@Component
public class WeChatPay implements Pay {
    @Override
    public void pay(String account, String payPassword) {
        System.out.println("微信支付成功！");
    }
}
