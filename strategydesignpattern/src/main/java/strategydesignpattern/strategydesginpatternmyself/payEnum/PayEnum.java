package strategydesignpattern.strategydesginpatternmyself.payEnum;

public enum PayEnum {
    WECHATPAY("strategydesignpattern.strategydesginpatternmyself.payImpl.WeChatPay"),
    ZHIFUBAOPAY("strategydesignpattern.strategydesginpatternmyself.payImpl.ZhifubaoPay");
    private String className;
    PayEnum(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
