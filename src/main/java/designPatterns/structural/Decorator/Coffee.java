package designPatterns.structural.Decorator;

interface Coffee {
    String getDescription();

    // Default method for price calculation (can be overridden)
    default double getCost() {
        return 2.0; // Base cost of coffee
    }
}