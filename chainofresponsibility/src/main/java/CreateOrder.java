public abstract class CreateOrder {

    private CreateOrder nextHandler;

    public CreateOrder getNextHandler() {
        return this.nextHandler;
    }

    public CreateOrder appendHandler(CreateOrder handler){
        this.nextHandler = handler;
        return this;
    }

    abstract void dealOrder();
}
