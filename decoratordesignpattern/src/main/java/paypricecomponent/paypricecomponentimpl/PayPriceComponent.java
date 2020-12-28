package paypricecomponent.paypricecomponentimpl;

import paypricecomponent.IPayPriceComponent;

public class PayPriceComponent implements IPayPriceComponent{

    @Override
    public void getPayPrice() {
        System.out.println("获取下单金额");
    }
}
