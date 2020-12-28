import paypriceDecorator.paypricedecoratorimpl.CouponPayPriceDecorator;
import paypriceDecorator.paypricedecoratorimpl.FreightPayPriceDecorator;
import paypricecomponent.IPayPriceComponent;
import paypricecomponent.paypricecomponentimpl.PayPriceComponent;

public class PayPriceFactory {

    public static IPayPriceComponent getPayPriceComponent(){
        IPayPriceComponent payPrice = new FreightPayPriceDecorator(
                new CouponPayPriceDecorator(
                        new PayPriceComponent()
                )
        );
        return payPrice;
    }

    public static void main(String[] args) {
        getPayPriceComponent().getPayPrice();
    }
}
