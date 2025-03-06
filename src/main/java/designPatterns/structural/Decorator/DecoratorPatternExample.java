package designPatterns.structural.Decorator;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Coffee plainCoffee = new SimpleCoffee();
        System.out.println(plainCoffee.getDescription() + " → $" + plainCoffee.getCost());

        // Add Milk
        Coffee milkCoffee = new MilkDecorator(plainCoffee);
        System.out.println(milkCoffee.getDescription() + " → $" + milkCoffee.getCost());

        // Add Sugar
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkSugarCoffee.getDescription() + " → $" + milkSugarCoffee.getCost());

        // Add Extra Shot
        Coffee fancyCoffee = new ExtraShotDecorator(milkSugarCoffee);
        System.out.println(fancyCoffee.getDescription() + " → $" + fancyCoffee.getCost());

    }
}
