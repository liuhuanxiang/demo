package behaviour.chain;

import java.util.Optional;

abstract class Handler {

    protected Handler successor;

    public Handler connect(Handler successor) {
        this.successor = successor;
        return successor;
    }

    public void handle(){
        this.doHandle();
        Optional
                .ofNullable(successor)
                .ifPresent(Handler::handle);

    }

    public abstract void doHandle();
}
