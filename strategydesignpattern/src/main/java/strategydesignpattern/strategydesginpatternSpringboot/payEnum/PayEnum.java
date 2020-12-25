package strategydesignpattern.strategydesginpatternSpringboot.payEnum;

public enum PayEnum {
    WECHATPAY("weChatPay"),ZHIFUBAOPAY("zhifubaoPay");

    private String className;

    PayEnum(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
