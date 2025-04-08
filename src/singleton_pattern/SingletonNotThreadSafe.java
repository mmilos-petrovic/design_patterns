package singleton_pattern;

public class SingletonNotThreadSafe {
    private static SingletonNotThreadSafe instance;

    private SingletonNotThreadSafe() {}

    public static SingletonNotThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonNotThreadSafe();
        }
        return instance;
    }

    public String getDescription() {
        return "Singleton With No Thread Safe";
    }
}
