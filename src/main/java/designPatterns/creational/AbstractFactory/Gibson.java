package designPatterns.creational.AbstractFactory;

public class Gibson implements Guitar {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Gibson guitar");
    }
}

