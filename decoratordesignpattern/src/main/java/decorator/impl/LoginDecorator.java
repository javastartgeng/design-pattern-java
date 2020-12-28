package decorator.impl;

import decorator.AbstractDecorator;
import decoratored.GatewayComponet;

public class LoginDecorator extends AbstractDecorator {

    public LoginDecorator(GatewayComponet gatewayComponet) {
        super(gatewayComponet);
    }

    @Override
    public void service() {
        super.service();
        System.out.println("第二步>>>网关中新增日志收集。。。");
    }
}
