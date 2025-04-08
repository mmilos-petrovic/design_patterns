package singleton_pattern;

public class ClientApp {
        public static void main(String[] args) {
            SingletonNotThreadSafe singletonNotThreadSafe = SingletonNotThreadSafe.getInstance();
            System.out.println(singletonNotThreadSafe.getDescription());

            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton.getDescription());

            SingletonWithData s = SingletonWithData.getInstance(5);
            SingletonWithData p = SingletonWithData.getInstance(18);
            System.out.println(s.getDescription()); // My data is: 5
            System.out.println(p.getDescription()); // My data is: 5
        }
}
