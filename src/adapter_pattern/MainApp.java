package adapter_pattern;

public class MainApp {

    public static void main(String[] args) {

        XmlData myData = new XmlData();
        Target target = new Adapter(new Adaptee());
        target.request(myData);

    }

}
