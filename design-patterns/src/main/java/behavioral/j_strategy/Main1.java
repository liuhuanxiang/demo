package behavioral.j_strategy;

public class Main1 extends Main{
	
	public Main1() {
		System.out.println("当前类的构造方法");
	}
	
	{
		System.out.println("当前类的代码块");
	}
	
	static {
		System.out.println("当前类的静态代码块");
		//System.out.println(ss);
		ss = "当前类的静态代码块替换类当前类的静态变量";
	}
	
	public static final String ss;
	
}
