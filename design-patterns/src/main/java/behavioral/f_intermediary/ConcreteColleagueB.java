package behavioral.f_intermediary;

/**
 * 从具体的同事对象接受消息，向具体同事对象发出命令，协调各同事间的协作
 */
public class ConcreteColleagueB extends Colleague {
	
	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
		this.mediator.setColleagueB(this);
	}
	
	public void selfMethodB() {
		System.out.println(String.format("%s:self-Method", this.getClass().getSimpleName()));
	}
	
	public void deMethodB() {
		System.out.println(String.format("%s:depMethod: delegate to Mediator", this.getClass().getSimpleName()));
		this.mediator.transferA();
	}
}
