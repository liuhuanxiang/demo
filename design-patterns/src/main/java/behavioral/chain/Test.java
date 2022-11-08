package behavioral.chain;

public class Test {
	
	public static void main(String[] args) {
		FirstHandler firstHandler = new FirstHandler();
		firstHandler.connect(new SecondHandler())
				.connect(new ThirdHandler());
		firstHandler.handle();
	}
	
}
