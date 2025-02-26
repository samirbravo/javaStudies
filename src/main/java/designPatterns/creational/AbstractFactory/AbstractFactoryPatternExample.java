package designPatterns.creational.AbstractFactory;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        GuitarFactory guitarFactory = FactoryProducer.getFactory("US");
        Guitar telecaster = guitarFactory.createFender();
        Guitar lesPaul = guitarFactory.createGibson();

        telecaster.manufacture();
        lesPaul.manufacture();

        guitarFactory = FactoryProducer.getFactory(null);
        telecaster = guitarFactory.createFender();
        lesPaul = guitarFactory.createGibson();

        telecaster.manufacture();
        lesPaul.manufacture();
    }
}
