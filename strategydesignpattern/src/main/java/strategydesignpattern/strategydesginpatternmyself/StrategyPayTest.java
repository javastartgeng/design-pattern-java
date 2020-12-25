package strategydesignpattern.strategydesginpatternmyself;

import strategydesignpattern.strategydesginpatternmyself.context.PayContext;
import strategydesignpattern.strategydesginpatternmyself.payEnum.PayEnum;

public class StrategyPayTest {

    public static void main(String[] args) {
        //微信支付测试
        PayContext contextWeChat = new PayContext(PayEnum.WECHATPAY);
        contextWeChat.pay("flyFish","123456");
        //支付宝支付
        PayContext contextZFB = new PayContext(PayEnum.ZHIFUBAOPAY);
        contextZFB.pay("guessMe","111111");
    }
}
