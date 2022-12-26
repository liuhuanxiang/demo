package behavioral.d_command.october31;

public class PlayCommand extends Command{
	
	private Play play;
	
	public PlayCommand(Play play) {
		super(play);
	}
	
	@Override
	void execute() {
		play.play();
	}
	
	
}
