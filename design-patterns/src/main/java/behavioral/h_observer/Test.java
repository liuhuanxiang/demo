package behavioral.h_observer;

public class Test {
	
	public static void main(String[] args) {
		//被观察者
		ConcreteSubject<String> observable = new ConcreteSubject<>();
		//观察者
		//ConcreteObserver<String> observer = new ConcreteObserver<>();
		//注册
		//observable.attach(observer);
		observable.notify("hello");
		observable.notify("ll");
		
	}
	
}
