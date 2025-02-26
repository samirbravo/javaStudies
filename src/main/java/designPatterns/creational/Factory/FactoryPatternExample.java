package designPatterns.creational.Factory;

public class FactoryPatternExample {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("Car");
        car.drive();

        Vehicle bike = VehicleFactory.getVehicle("Bike");
        bike.drive();
    }
}
