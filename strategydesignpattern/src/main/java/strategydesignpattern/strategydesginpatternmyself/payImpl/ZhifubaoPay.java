package strategydesignpattern.strategydesginpatternmyself.payImpl;

import strategydesignpattern.strategydesginpatternmyself.pay.Pay;

public class ZhifubaoPay implements Pay {
    @Override
    public void pay(String account, String payPassword) {
        System.out.println("支付宝支付成功！");
    }
}
