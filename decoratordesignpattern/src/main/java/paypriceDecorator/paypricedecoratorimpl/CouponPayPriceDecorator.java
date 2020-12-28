package paypriceDecorator.paypricedecoratorimpl;

import paypriceDecorator.PayPriceDecorator;
import paypricecomponent.IPayPriceComponent;

public class CouponPayPriceDecorator extends PayPriceDecorator {

    public CouponPayPriceDecorator(IPayPriceComponent iPayPriceComponent) {
        super(iPayPriceComponent);
    }

    @Override
    public void getPayPrice(){
        super.getPayPrice();
        System.out.println("获取优惠券价格");
    }
}
