package adapter_pattern;

public class Adapter implements Target {

    private final Adaptee a;

    public Adapter(Adaptee a)
    {
        this.a = a;
    }

    @Override
    public void request(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        a.displayMenus(jsonData);
    }


    private JsonData convertXmlToJson(XmlData xmlData) {
        return new JsonData();
    }

}

