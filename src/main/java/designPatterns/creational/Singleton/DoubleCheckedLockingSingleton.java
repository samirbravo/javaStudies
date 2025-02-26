package designPatterns.creational.Singleton;

public class DoubleCheckedLockingSingleton {
    private static DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {
    } //Private constructor


    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) { //first check (no locking)
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) { //second check (with locking)
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}

//✅ Pros: Efficient, thread-safe, avoids unnecessary locking.
//❌ Cons: More complex implementation.
