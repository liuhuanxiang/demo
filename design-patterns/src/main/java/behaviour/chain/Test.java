package behaviour.chain;

public class Test {

    public static void main(String[] args) {
        FirstHandler handler = new FirstHandler();
        handler
                .connect(new SecondHandler())
                .connect(new ThirdHandler());
        handler.handle();
    }
}
