package designPatterns.behavioral.ChainOfResponsibility;

public class ChainOfResponsibilityPatternExample {
    public static void main(String[] args) {
        //Create Loggers
        Logger infoLogger = new InfoLogger();
        Logger debugLogger = new DebugLogger();
        Logger errorLogger = new ErrorLogger();

        //Define the chain
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        //Test different log levels
        infoLogger.logMessage("This is an info message", LogLevel.INFO);
        infoLogger.logMessage("This is a debug message", LogLevel.DEBUG);
        infoLogger.logMessage("This is an error message", LogLevel.ERROR);
    }
}
