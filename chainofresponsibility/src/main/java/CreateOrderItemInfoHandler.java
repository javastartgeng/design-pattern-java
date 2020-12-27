public class CreateOrderItemInfoHandler extends CreateOrder {
    @Override
    void dealOrder() {
        System.out.println("创建订单商品信息成功！");
        CreateOrder nextHandler = super.getNextHandler();
        if(null!= nextHandler){
            nextHandler .dealOrder();
        }
    }
}
