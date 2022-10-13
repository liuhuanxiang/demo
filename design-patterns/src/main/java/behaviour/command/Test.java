package behaviour.command;

public class Test {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        Controller.call(new OpenCommand(airConditioner));
    }
}
