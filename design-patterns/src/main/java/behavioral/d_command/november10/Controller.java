package behavioral.d_command.november10;

public class Controller<T extends BaseDTO> {

	private Command<T> command;
	private T t;
	
	public void setCommand(Command<T> command) {
		this.command = command;
	}
	
	public void execute(T t) {
		command.execute(t);
	}
	
	public void undo(T t) {
		command.undo(t);
	}

}
