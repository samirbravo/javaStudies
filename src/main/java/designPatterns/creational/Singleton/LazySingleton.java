package designPatterns.creational.Singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    } //Private constructor

    //getInstance() could be synchronized to be thread-safe but has a performance cost due to locking
    public static LazySingleton getInstance() {
        if (instance == null) instance = new LazySingleton();
        return instance;
    }
}

//✅ Pros: Saves memory (instance created only when needed).
//❌ Cons: Not thread-safe (two threads might create different instances).
