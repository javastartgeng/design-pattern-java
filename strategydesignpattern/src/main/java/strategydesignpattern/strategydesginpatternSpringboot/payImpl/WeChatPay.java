package strategydesignpattern.strategydesginpatternSpringboot.payImpl;

import org.springframework.stereotype.Component;
import strategydesignpattern.strategydesginpatternSpringboot.pay.Pay;

@Component
public class WeChatPay implements Pay {
    @Override
    public void pay(String account, String payPassword) {
        System.out.println("微信支付成功！");
    }
}
