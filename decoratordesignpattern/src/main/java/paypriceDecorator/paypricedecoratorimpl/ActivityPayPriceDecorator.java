package paypriceDecorator.paypricedecoratorimpl;

import paypriceDecorator.PayPriceDecorator;
import paypricecomponent.IPayPriceComponent;

public class ActivityPayPriceDecorator extends PayPriceDecorator {

    public ActivityPayPriceDecorator(IPayPriceComponent iPayPriceComponent) {
        super(iPayPriceComponent);
    }

    @Override
    public void getPayPrice(){
        super.getPayPrice();
        System.out.println("获取活动折扣价格");
    }
}
