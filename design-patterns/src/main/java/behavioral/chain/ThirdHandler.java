package behavioral.chain;

public class ThirdHandler extends Handler{
	
	@Override
	public void doHandle() {
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
	}
}
