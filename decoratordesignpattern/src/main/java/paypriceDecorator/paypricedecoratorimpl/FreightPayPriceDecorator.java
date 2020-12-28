package paypriceDecorator.paypricedecoratorimpl;

import paypriceDecorator.PayPriceDecorator;
import paypricecomponent.IPayPriceComponent;

public class FreightPayPriceDecorator extends PayPriceDecorator {

    public FreightPayPriceDecorator(IPayPriceComponent iPayPriceComponent) {
        super(iPayPriceComponent);
    }

    @Override
    public void getPayPrice(){
        super.getPayPrice();
        System.out.println("获取运费价格");
    }
}
