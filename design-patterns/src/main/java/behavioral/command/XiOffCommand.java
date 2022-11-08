package behavioral.command;

public class XiOffCommand implements Command{
	
	XiConditioner xi;
	
	
	protected XiOffCommand(XiConditioner xi) {
		super();
		this.xi = xi;
	}
	
	@Override
	public void execute() {
		xi.off();
	}
	
	@Override
	public void undo() {
		xi.action();
	}
}
