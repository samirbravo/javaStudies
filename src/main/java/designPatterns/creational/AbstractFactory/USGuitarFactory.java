package designPatterns.creational.AbstractFactory;

public class USGuitarFactory implements GuitarFactory {
    @Override
    public Guitar createFender() {
        return new Fender();
    }

    @Override
    public Guitar createGibson() {
        return new Gibson();
    }
}
