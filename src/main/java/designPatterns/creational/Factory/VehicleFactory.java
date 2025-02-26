package designPatterns.creational.Factory;

public class VehicleFactory {
    public static Vehicle getVehicle(final String type) {
        return switch (type.toLowerCase()) {
            case "car" -> new Car();
            case "bike" -> new Bike();
            default -> null; //or throw exception
        };
    }
}
