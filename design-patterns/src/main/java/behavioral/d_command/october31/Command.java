package behavioral.d_command.october31;

public abstract class Command {
	
	private final Play play;
	
	public Command(Play play) {
		this.play = play;
	}
	
	abstract void execute();
}
