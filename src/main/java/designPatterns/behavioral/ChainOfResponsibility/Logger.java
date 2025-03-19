package designPatterns.behavioral.ChainOfResponsibility;

public abstract class Logger {
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(String message, LogLevel level) {
        if (canHandle(level)) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(message, level);
        }

    }

    protected abstract boolean canHandle(LogLevel level);

    protected abstract void write(String message);

}
