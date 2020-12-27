public class CreateOrderApprovalInfoHandler extends CreateOrder {
    @Override
    void dealOrder() {
        System.out.println("创建订单审批信息成功！");
        CreateOrder nextHandler = super.getNextHandler();
        if(null!= nextHandler){
            nextHandler .dealOrder();
        }
    }
}
