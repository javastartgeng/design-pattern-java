public class CreateOrderTest {
    public static void main(String[] args) {
        CreateOrder createOrder = new CreateOrderPayInfoHandler()
                .appendHandler(new CreateOrderApprovalInfoHandler()
                        .appendHandler(new CreateOrderInfoHandler()
                                .appendHandler(new CreateOrderItemInfoHandler())));
        createOrder.dealOrder();
    }
}
