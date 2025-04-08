package adapter_pattern;

public class Adapter implements Target {

    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee)
    {
        this.adaptee = adaptee;
    }

    @Override
    public void request(DataFormatForClient dataFormatForClient) {
        DataFormatForAdaptee dataFormatForAdaptee = convertDataFormat(dataFormatForClient);
        adaptee.requestOnAdaptee(dataFormatForAdaptee);
    }


    private DataFormatForAdaptee convertDataFormat(DataFormatForClient dataFormatForClient)
    {
        return new DataFormatForAdaptee();
    }

}

