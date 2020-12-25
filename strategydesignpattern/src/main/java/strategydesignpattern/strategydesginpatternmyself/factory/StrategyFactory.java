package strategydesignpattern.strategydesginpatternmyself.factory;

import strategydesignpattern.strategydesginpatternmyself.pay.Pay;

public class StrategyFactory {
    /**
     * 动态获取支付方式
     * @param className
     * @return
     */
    public static Pay getPayMethodByClassName(String className){
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
