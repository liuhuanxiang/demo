package behavioral.d_command;

public class AirOpenCommand implements Command {
	
	AirConditioner airConditioner;
	
	
	protected AirOpenCommand(AirConditioner airConditioner) {
		super();
		this.airConditioner = airConditioner;
	}
	
	@Override
	public void execute() {
		airConditioner.action();
		
	}
	
	@Override
	public void undo() {
		airConditioner.off();
	}
	
	
}
