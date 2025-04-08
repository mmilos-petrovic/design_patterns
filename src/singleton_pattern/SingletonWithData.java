package singleton_pattern;

public class SingletonWithData {
    private static SingletonWithData instance;
    private final int x;

    private SingletonWithData(int x) {
        this.x = x;
    }

    public static synchronized SingletonWithData getInstance(int x) {
        if (instance == null) {
            instance = new SingletonWithData(x);
        }
        return instance;
    }

    public String getDescription()
    {
        return "My data is: "  + Integer.toString(this.x);
    }
}