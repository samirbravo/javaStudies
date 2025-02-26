package designPatterns.creational.AbstractFactory;

public class WorldGuitarFactory implements GuitarFactory {
    @Override
    public Guitar createFender() {
        return new MexicanFender();
    }

    @Override
    public Guitar createGibson() {
        return new UKGibson();
    }
}
