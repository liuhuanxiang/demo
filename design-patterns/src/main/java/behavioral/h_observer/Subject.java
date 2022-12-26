package behavioral.h_observer;

public interface Subject<E> {
	
	/**
	 * 附加
	 * @param observer
	 * @return
	 */
	boolean attach(Observer<E> observer);
	
	/**
	 * 分离
	 * @param observer
	 * @return
	 */
	boolean detach(Observer<E> observer);
	
	/**
	 * 通知
	 * @param event
	 */
	void notify(E event);

}
