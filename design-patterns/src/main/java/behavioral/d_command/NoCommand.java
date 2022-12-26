package behavioral.d_command;

public class NoCommand implements Command{
	
	@Override
	public void execute() {
		//System.out.println("执行-无操作");
	}
	
	@Override
	public void undo() {
		//System.out.println("撤回-误操作");
	}
}
