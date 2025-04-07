
package adapter_pattern;

public class Client implements Target {



    @Override
    public void request(XmlData xmlData) {
        System.out.println("Displaying Menus using XML data...");
    }

}

