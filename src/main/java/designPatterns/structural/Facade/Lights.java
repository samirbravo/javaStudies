package designPatterns.structural.Facade;

public class Lights {
    public void on() {
        System.out.println("Lights is ON");
    }

    public void dim(int level) {
        System.out.println("Dimming lights to " + level + "%");
    }

    public void off() {
        System.out.println("Lights is OFF");
    }
}
