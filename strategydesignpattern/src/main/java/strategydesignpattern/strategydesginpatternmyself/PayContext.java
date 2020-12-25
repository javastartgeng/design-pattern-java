package strategydesignpattern.strategydesginpatternmyself;

import strategydesignpattern.strategydesginpatternmyself.payEnum.PayEnum;
import strategydesignpattern.strategydesginpatternmyself.pay.Pay;

public class PayContext {

    private Pay payMethod;

    public PayContext(PayEnum payMethod) {
        this.payMethod = getPayMethodByClassName(payMethod.getClassName());
    }

    /**
     * 进行支付
     * @param accout
     * @param payPassword
     */
    public void pay(String accout,String payPassword){
        payMethod.pay(accout,payPassword);
    }

    /**
     * 动态获取支付方式
     * @param className
     * @return
     */
    private Pay getPayMethodByClassName(String className){
        try {
            return (Pay) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
