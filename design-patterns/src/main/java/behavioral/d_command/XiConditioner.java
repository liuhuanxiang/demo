package behavioral.d_command;

public class XiConditioner implements Receiver{
	
	@Override
	public void action() {
		System.out.println("开启洗地机");
	}
	
	@Override
	public void off() {
		System.out.println("关闭洗地机");
	}
}
