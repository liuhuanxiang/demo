package behavioral.command;

public class XiOnCommand implements Command{
	
	XiConditioner xi;
	
	
	protected XiOnCommand(XiConditioner xi) {
		super();
		this.xi = xi;
	}
	
	@Override
	public void execute() {
		xi.action();
	}
	
	@Override
	public void undo() {
		xi.off();
	}
}
