package behavioral.chain;

public class SecondHandler extends Handler{
	
	@Override
	public void doHandle() {
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		
	}
}
