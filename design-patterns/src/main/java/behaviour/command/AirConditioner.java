package behaviour.command;

public class AirConditioner implements Receiver{
    @Override
    public void action() {
        System.out.println("空调已开启");
    }
}
