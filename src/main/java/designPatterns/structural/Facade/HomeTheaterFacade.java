package designPatterns.structural.Facade;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Lights lights;

    public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer, Projector projector, Lights lights) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("\nStarting movie mode...");
        lights.dim(10);
        amplifier.on();
        dvdPlayer.on();
        projector.on();
        projector.setInput("Dvd Player");
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("\nShutting down home theater...");
        lights.on();
        projector.off();
        dvdPlayer.off();
        amplifier.off();
    }
}
