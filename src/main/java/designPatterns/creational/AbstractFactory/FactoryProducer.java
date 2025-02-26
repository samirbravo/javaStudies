package designPatterns.creational.AbstractFactory;

public class FactoryProducer {
    public static GuitarFactory getFactory(String region) {
        if (region != null && region.equalsIgnoreCase("US")) {
            return new USGuitarFactory();
        }
        return new WorldGuitarFactory();
    }
}
