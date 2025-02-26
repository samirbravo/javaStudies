package designPatterns.creational.Builder;

public class Vehicle {
    private String type;  // Required
    private int wheels;   // Required
    private boolean hasAirConditioning; // Optional
    private boolean hasGPS; // Optional

    // Private constructor to force object creation via Builder
    private Vehicle(VehicleBuilder builder) {
        this.type = builder.type;
        this.wheels = builder.wheels;
        this.hasAirConditioning = builder.hasAirConditioning;
        this.hasGPS = builder.hasGPS;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", wheels=" + wheels +
                ", hasAirConditioning=" + hasAirConditioning +
                ", hasGPS=" + hasGPS +
                '}';
    }

    public static class VehicleBuilder {
        private String type;
        private int wheels;
        private boolean hasAirConditioning = false; // Default value
        private boolean hasGPS = false; // Default value

        public VehicleBuilder(String type, int wheels) {
            this.type = type;
            this.wheels = wheels;
        }

        public VehicleBuilder withAirConditioning() {
            this.hasAirConditioning = true;
            return this;
        }

        public VehicleBuilder withGPS() {
            this.hasGPS = true;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}
