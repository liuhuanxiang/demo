package behavioral.j_strategy;

public class JdPay extends Payment{
	
	@Override
	public String getName() {
		return "京东";
	}
	
	@Override
	public double queryBalance(String uid) {
		return 350;
	}
}
