public abstract class Handler implements HandlerInterface {
    private Handler next;

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }

}
