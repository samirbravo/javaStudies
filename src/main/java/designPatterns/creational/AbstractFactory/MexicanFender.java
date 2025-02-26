package designPatterns.creational.AbstractFactory;

public class MexicanFender implements Guitar {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Mexican Fender guitar");
    }
}
