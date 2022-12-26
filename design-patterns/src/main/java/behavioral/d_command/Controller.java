package behavioral.d_command;

public class Controller {
	
	private final Command[] onCommands;
	private final Command[] offCommands;
	//
	//private NoCommand noCommand;
	
	
	private Command undoCommand;
	
	
	
	class Tt{
		private Double horsepower = null;
	}
	
	public Controller() {
		onCommands = new Command[5];
		offCommands = new Command[5];
		
		//for (int i = 0; i < 5; i++) {
		//	onCommands[i] = new NoCommand();
		//	offCommands[i] = new NoCommand();
		//}
	}
	
	public NoCommand getNo(){
		return new NoCommand();
	}
	public void setNo(NoCommand noCommand){
		System.out.println(noCommand.toString());
	}
	
	public void setCommand(int no, Command onCommand, Command offCommand) {
		onCommands[no] = onCommand;
		offCommands[no] = offCommand;
	}
	
	public void onButtonWasPushed(int no) {
		onCommands[no].execute();
		
		undoCommand = onCommands[no];
	}
	
	public void offButtonWasPushed(int no) {
		offCommands[no].execute();
		
		undoCommand = offCommands[no];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
	
}
