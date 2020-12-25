package strategydesignpattern.strategydesginpatternmyself.context;

import strategydesignpattern.strategydesginpatternmyself.factory.StrategyFactory;
import strategydesignpattern.strategydesginpatternmyself.pay.Pay;
import strategydesignpattern.strategydesginpatternmyself.payEnum.PayEnum;

public class PayContext {

    private Pay payMethod;

    public PayContext(PayEnum payMethod) {
        this.payMethod = StrategyFactory.getPayMethodByClassName(payMethod.getClassName());
    }

    /**
     * 进行支付
     * @param accout
     * @param payPassword
     */
    public void pay(String accout,String payPassword){
        payMethod.pay(accout,payPassword);
    }
}
