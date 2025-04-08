package adapter_pattern;

public class ClientApp {

    public static void main(String[] args) {

        DataFormatForClient dataFormatForClient = new DataFormatForClient();
        Target client = new Client();
        client.request(dataFormatForClient);


        Target adapter = new Adapter(new Adaptee());
        adapter.request(dataFormatForClient);

    }

}
