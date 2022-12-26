package behavioral.d_command.demo1;

public class StopAction implements Action{
	
	Player player;
	
	public StopAction(Player player) {
		this.player = player;
	}
	
	@Override
	public void execute() {
		player.stop();
		
	}
}
