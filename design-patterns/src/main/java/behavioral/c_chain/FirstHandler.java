package behavioral.c_chain;

public class FirstHandler extends Handler{
	
	@Override
	public void doHandle() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
	}
}
