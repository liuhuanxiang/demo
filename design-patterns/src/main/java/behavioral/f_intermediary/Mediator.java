package behavioral.f_intermediary;

/**
 * 抽象中介者：定义统一的接口，用于各同事之间的通信
 */
public abstract class Mediator {
	
	protected ConcreteColleagueA colleagueA;
	protected ConcreteColleagueB colleagueB;
	
	public void setColleagueA(ConcreteColleagueA colleagueA) {
		this.colleagueA = colleagueA;
	}
	
	public void setColleagueB(ConcreteColleagueB colleagueB) {
		this.colleagueB = colleagueB;
	}
	
	public abstract void transferA();
	
	public abstract void transferB();
}
