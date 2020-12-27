public class CreateOrderInfoHandler extends CreateOrder {
    @Override
    void dealOrder() {
        System.out.println("创建订单信息成功！");
        CreateOrder nextHandler = super.getNextHandler();
        if(null!= nextHandler){
            nextHandler .dealOrder();
        }
    }
}
