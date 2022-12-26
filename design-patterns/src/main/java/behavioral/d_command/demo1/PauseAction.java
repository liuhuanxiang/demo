package behavioral.d_command.demo1;

public class PauseAction implements Action {
	
	Player player;
	
	public PauseAction(Player player) {
		this.player = player;
	}
	
	@Override
	public void execute() {
		player.pause();
	}
}
