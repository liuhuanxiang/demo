package behavioral.j_strategy;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {
	public static final String ALI_PAY = "AliPay";
	public static final String JD_PAY = "JdPay";
	public static final String WECHAT_PAY = "WeChatPay";
	public static final String DEFAULT_PAY = "WeChatPay";
	
	private static final Map<String ,Payment> strategy = new HashMap<>();
	
	static {
		strategy.put(ALI_PAY, new AliPay());
		strategy.put(JD_PAY, new JdPay());
		strategy.put(WECHAT_PAY, new WeChatPay());
		strategy.put(DEFAULT_PAY, new WeChatPay());
	}
	
	public static Payment getStrategy(String payKey) {
		if (!strategy.containsKey(payKey)){
			return strategy.get(DEFAULT_PAY);
		}
		return strategy.get(payKey);
	}
}
