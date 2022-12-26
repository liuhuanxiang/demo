package behavioral.f_intermediary;

/**
 * 具体中介类：负责实现自发行为，转发依赖方法，交由中介者进行协调
 */
public class ConcreteMediator extends Mediator {
	
	public void transferA() {
		//协调行为：转发到A
		this.colleagueA.selfMethodA();
	}
	
	@Override
	public void transferB() {
		this.colleagueB.selfMethodB();
	}
	
}
