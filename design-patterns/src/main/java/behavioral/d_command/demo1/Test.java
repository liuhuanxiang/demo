package behavioral.d_command.demo1;

public class Test {
	
	public static void main(String[] args) {
		Controller controller = new Controller();
		Player player = new Player();
		controller.execute(new PlayAction(player));
		
		controller.addAction(new PlayAction(player));
		controller.addAction(new StopAction(player));
		controller.addAction(new PauseAction(player));
		controller.execute();
		controller.addAction(new PlayAction(player));
		controller.addAction(new StopAction(player));
		controller.addAction(new PauseAction(player));
		controller.execute();
	}
	
}
