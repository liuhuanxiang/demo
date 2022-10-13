package behaviour.command;


public abstract class Command {

    private final Receiver receiver;


    protected Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }
}
