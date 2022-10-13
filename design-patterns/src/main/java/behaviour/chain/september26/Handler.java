package behaviour.chain.september26;

import java.util.Optional;

public abstract class Handler {

     protected Handler successor;

     public Handler(Handler successor) {
          this.successor = successor;
     }

     void handle() {
          //调用
          this.handle();
          Optional.ofNullable(successor)
                  .ifPresent(Handler::handle);

     }

     abstract void doHandler();
}
