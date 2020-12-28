package decorator;

import decoratored.GatewayComponet;

public abstract class AbstractDecorator extends GatewayComponet {

    public GatewayComponet gatewayComponet;

    public AbstractDecorator(GatewayComponet gatewayComponet){
        this.gatewayComponet = gatewayComponet;
    }

    @Override
    public void service() {
        gatewayComponet.service();
    }
}
