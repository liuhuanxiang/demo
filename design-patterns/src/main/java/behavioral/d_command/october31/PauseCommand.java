package behavioral.d_command.october31;

public class PauseCommand extends Command{
	
	Play play;
	
	public PauseCommand(Play play) {
		super(play);
	}
	
	@Override
	void execute() {
		play.pause();
	}
}
