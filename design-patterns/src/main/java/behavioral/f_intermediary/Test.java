package behavioral.f_intermediary;

public class Test {
	
	public static void main(String[] args) {
		//new ConcreteMediatorA()
		ConcreteMediator concreteMediator = new ConcreteMediator();
		ConcreteColleagueA colleagueA = new ConcreteColleagueA(concreteMediator);
		ConcreteColleagueB colleagueB = new ConcreteColleagueB(concreteMediator);
		colleagueA.selfMethodA();
		colleagueA.deMethodB();
	}
	
}
