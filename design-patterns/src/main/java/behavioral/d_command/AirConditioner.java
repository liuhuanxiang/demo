package behavioral.d_command;

public class AirConditioner implements Receiver{
	
	@Override
	public void action() {
		System.out.println("空调已开启，呼呼呼");
	}
	
	@Override
	public void off(){
		System.out.println("空调关闭");
	}
}
