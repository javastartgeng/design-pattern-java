package strategydesignpattern.strategydesginpatternmyself.payimpl;

import strategydesignpattern.strategydesginpatternmyself.pay.Pay;

public class WeChatPay implements Pay {
    @Override
    public void pay(String account, String payPassword) {
        System.out.println("微信支付成功！");
    }
}
