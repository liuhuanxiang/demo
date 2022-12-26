package behavioral.d_command;

public class Test {
	
	public static void main(String[] args) {
		AirConditioner airConditioner = new AirConditioner();
		XiConditioner xiConditioner = new XiConditioner();

		AirOpenCommand airOpenCommand = new AirOpenCommand(airConditioner);
		AirOffCommand airOffCommand = new AirOffCommand(airConditioner);

		XiOnCommand xiOnCommand = new XiOnCommand(xiConditioner);
		XiOffCommand xiOffCommand = new XiOffCommand(xiConditioner);

		Controller controller = new Controller();
		controller.setCommand(0, airOpenCommand, airOffCommand);
		controller.setCommand(1, xiOnCommand, xiOffCommand);
		
		//controller.setCommand(1, airOpenCommand, airOffCommand);

		

		controller.onButtonWasPushed(0);

		controller.offButtonWasPushed(0);
		controller.undoButtonWasPushed();

		controller.onButtonWasPushed(1);

		controller.offButtonWasPushed(1);
		controller.undoButtonWasPushed();
		
		
		

		controller.onButtonWasPushed(3);
		controller.onButtonWasPushed(2);
		controller.onButtonWasPushed(1);
	}
	
}
