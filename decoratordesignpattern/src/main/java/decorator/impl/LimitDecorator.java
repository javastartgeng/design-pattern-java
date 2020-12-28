package decorator.impl;

import decorator.AbstractDecorator;
import decoratored.GatewayComponet;

public class LimitDecorator extends AbstractDecorator {

    public LimitDecorator(GatewayComponet gatewayComponet) {
        super(gatewayComponet);
    }

    @Override
    public void service() {
        super.service();
        System.out.println("第三步>>>网关中新增限流。。。");
    }
}
