package designPatterns.behavioral.Command;

public class StopFanCommand implements Command {
    private final Fan fan;

    public StopFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.stop();
    }
}
