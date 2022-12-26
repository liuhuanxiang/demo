package behavioral.h_observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject<E> implements Subject<E>{
	
	private final List<Observer<E>> observerList = new ArrayList<>();
	
	@Override
	public boolean attach(Observer<E> observer) {
		if (this.observerList.contains(observer)) {
			return false;
		}
		this.observerList.add(observer);
		return true;
	}
	
	@Override
	public boolean detach(Observer<E> observer) {
		return this.observerList.remove(observer);
	}
	
	@Override
	public void notify(E event) {
		for (Observer<E> eObserver : this.observerList) {
			eObserver.update(event);
		}
	}
}
