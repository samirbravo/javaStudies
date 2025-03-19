package designPatterns.behavioral.ChainOfResponsibility;

public class InfoLogger extends Logger {
    @Override
    protected boolean canHandle(LogLevel level) {
        return level == LogLevel.INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}
