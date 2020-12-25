package strategydesignpattern.strategydesginpatternmyself.payEnum;

public enum PayEnum {
    WECHATPAY("strategydesignpattern.strategydesginpatternmyself.payimpl.WeChatPay"),
    ZHIFUBAOPAY("strategydesignpattern.strategydesginpatternmyself.payimpl.ZhifubaoPay");
    private String className;
    PayEnum(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
