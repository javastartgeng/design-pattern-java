package strategydesignpattern.strategydesginpatternSpringboot.payImpl;

import org.springframework.stereotype.Component;
import strategydesignpattern.strategydesginpatternSpringboot.pay.Pay;

@Component
public class ZhifubaoPay implements Pay {
    @Override
    public void pay(String account, String payPassword) {
        System.out.println("支付宝支付成功！");
    }
}
