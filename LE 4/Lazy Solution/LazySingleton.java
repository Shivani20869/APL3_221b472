// Lazy Initialization Singleton (Thread-safe)
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        // Private constructor to prevent instantiation
    }

    // Thread-safe Singleton
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
