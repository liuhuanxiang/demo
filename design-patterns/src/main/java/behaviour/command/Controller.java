package behaviour.command;

public class Controller {
    public static void call(Command command) {
        command.execute();
    }
}
