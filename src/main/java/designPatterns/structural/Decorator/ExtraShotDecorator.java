package designPatterns.structural.Decorator;

public class ExtraShotDecorator extends CoffeeDecorator {
    public ExtraShotDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Extra Shot";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 1.0;
    }
}
