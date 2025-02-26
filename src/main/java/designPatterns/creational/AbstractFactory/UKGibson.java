package designPatterns.creational.AbstractFactory;

public class UKGibson implements Guitar {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing UK Gibson guitar");
    }
}
