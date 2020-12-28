package paypriceDecorator;

import paypricecomponent.IPayPriceComponent;

public abstract class PayPriceDecorator implements IPayPriceComponent{

    private IPayPriceComponent iPayPriceComponent;

    public PayPriceDecorator(IPayPriceComponent iPayPriceComponent){
        this.iPayPriceComponent = iPayPriceComponent;
    }

    @Override
    public void getPayPrice(){
        iPayPriceComponent.getPayPrice();
    }

}
