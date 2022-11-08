package behavioral.command;

public class AirOffCommand implements Command{
	
	AirConditioner airConditioner;
	
	public AirOffCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}
	
	@Override
	public void execute() {
		airConditioner.off();
	}
	
	@Override
	public void undo() {
		airConditioner.action();
	}
}
