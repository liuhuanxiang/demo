package behavioral.h_observer;

public class ConcreteObserver<E> implements Observer<E>{
	
	@Override
	public void update(E event) {
		System.out.println("receive event: " + event);
	}
}
