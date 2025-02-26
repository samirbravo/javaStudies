package designPatterns.creational.Builder;

public class BuilderPatternExample {
    public static void main(String[] args) {
        // Creating a Car with Air Conditioning and GPS
        Vehicle car = new Vehicle.VehicleBuilder("Car", 4)
                .withGPS()
                .withAirConditioning()
                .build();

        // Creating a Bike with only basic features
        Vehicle bike = new Vehicle.VehicleBuilder("Bike", 2)
                .build();

        System.out.println(car);
        System.out.println(bike);
    }
}
