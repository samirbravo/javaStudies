package designPatterns.creational.Singleton;

public class BillPughSingleton {
    private BillPughSingleton() {
    }

    public static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

//✅ Pros: Thread-safe, lazy initialization, high performance.
//❌ Cons: Slightly less readable for beginners.
