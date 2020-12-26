package strategydesignpattern.strategydesignpattrendata.impl;

import org.springframework.stereotype.Component;
import strategydesignpattern.strategydesignpattrendata.pay.Pay;

@Component
public class ZhifubaoPay implements Pay {
    @Override
    public String pay(String account, String payPassword) {
        return "支付宝支付成功！";
    }
}
