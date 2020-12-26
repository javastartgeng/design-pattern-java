package strategydesignpattern.strategydesignpattrendata.impl;

import org.springframework.stereotype.Component;
import strategydesignpattern.strategydesignpattrendata.pay.Pay;

@Component
public class WeChatPay implements Pay {
    @Override
    public String pay(String account, String payPassword) {
        return "微信支付成功！";
    }
}
