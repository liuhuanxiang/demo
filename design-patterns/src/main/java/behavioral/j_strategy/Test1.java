package behavioral.j_strategy;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
	
	public static void main(String[] args) {
		Order order = new Order("123", "456", 100);
		MsgResult pay = order.pay(PayStrategy.JD_PAY);
		System.out.println(pay);
		
		Arrays.parallelSort();
	}
	
}
