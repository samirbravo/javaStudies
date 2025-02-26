package designPatterns.creational.Singleton;

public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton(); //Eager initialization

    private EagerSingleton() {
    } //Private constructor

    public static EagerSingleton getINSTANCE() {
        return INSTANCE;
    }

}
//✅ Pros: Simple, thread-safe
//❌ Cons: Instance is created even if it is never used
