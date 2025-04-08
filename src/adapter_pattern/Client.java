
package adapter_pattern;

public class Client implements Target {

    @Override
    public void request(DataFormatForClient dataFormatForClient) {
        System.out.println("Working on client side using dataFormatForClient.");
    }

}

