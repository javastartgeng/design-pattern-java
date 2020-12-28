package factory;

import decorator.impl.LimitDecorator;
import decorator.impl.LoginDecorator;
import decoratored.BasicGatewayComponent;
import decoratored.GatewayComponet;

public class Factory {
    public static GatewayComponet getGatewayComponent(){
        LimitDecorator limit = new LimitDecorator(
                new LoginDecorator(
                        new BasicGatewayComponent()
        ));
        return limit;
    }

    public static void main(String[] args) {
        GatewayComponet componet = Factory.getGatewayComponent();
        componet.service();
    }
}
