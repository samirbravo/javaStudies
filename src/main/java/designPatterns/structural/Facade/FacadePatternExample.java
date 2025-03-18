package designPatterns.structural.Facade;

public class FacadePatternExample {
    public static void main(String[] args) {
        // Create subsystem components
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();

        // Create Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, lights);

        // Use simplified interface
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
