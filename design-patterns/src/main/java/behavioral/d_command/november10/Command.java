package behavioral.d_command.november10;

public interface Command<T> {
	
	public void execute(T t);
	
	public void undo(T t);
	
}
