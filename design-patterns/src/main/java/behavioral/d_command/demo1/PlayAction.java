package behavioral.d_command.demo1;

public class PlayAction implements Action {
	
	Player player;
	
	public PlayAction(Player player) {
		this.player = player;
	}
	
	public void execute() {
		player.play();
	}
	
}
