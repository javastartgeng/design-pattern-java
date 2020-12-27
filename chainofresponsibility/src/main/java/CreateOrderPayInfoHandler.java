public class CreateOrderPayInfoHandler extends CreateOrder {
    @Override
    void dealOrder() {
        System.out.println("创建订单支付信息成功！");
        CreateOrder nextHandler = super.getNextHandler();
        if(null!= nextHandler){
            nextHandler .dealOrder();
        }
    }
}
