package designPatterns.behavioral.Command;

public class CommandPatternExample {
    public static void main(String[] args) {
        // Create receivers
        Light light = new Light();
        Fan fan = new Fan();

        // Create commands
        Command turnOnLight = new TurnOnLightCommand(light);
        Command turnOffLight = new TurnOffLightCommand(light);
        Command startFan = new StartFanCommand(fan);
        Command stopFan = new StopFanCommand(fan);

        // Create invoker (remote)
        RemoteControl remote = new RemoteControl();

        // Execute commands
        remote.setCommand(turnOnLight);
        remote.pressButton(); // Light is ON

        remote.setCommand(startFan);
        remote.pressButton(); // Fan is STARTED

        remote.setCommand(stopFan);
        remote.pressButton(); // Fan is STOPPED

        remote.setCommand(turnOffLight);
        remote.pressButton(); // Light is OFF
    }
}