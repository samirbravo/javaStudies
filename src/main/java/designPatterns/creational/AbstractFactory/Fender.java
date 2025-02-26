package designPatterns.creational.AbstractFactory;

public class Fender implements Guitar {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Fender guitar");
    }
}

