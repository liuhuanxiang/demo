package behavioral.j_strategy;

public class Order {
	
	private String uid;
	private String orderId;
	private double amount;
	
	public Order(String uid, String orderId, double amount) {
		this.uid = uid;
		this.orderId = orderId;
		this.amount = amount;
	}
	
	public MsgResult pay() {
		return pay(PayStrategy.DEFAULT_PAY);
	}
	
	public MsgResult pay(String payKey) {
		Payment payment = PayStrategy.getStrategy(payKey);
		System.out.println("本次交易使用："+ payment.getName());
		System.out.println("交易金额："+amount);
		return payment.pay(uid, amount);
	}
	
}
