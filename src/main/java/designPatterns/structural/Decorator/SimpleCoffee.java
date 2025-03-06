package designPatterns.structural.Decorator;

class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Plain Coffee";
    }
    //base coffee price is 2.0
}
