public class StringInstrument extends Instrument{

    public StringInstrument (String name, int price) {
        super(name, price);
    }

    @Override
    void play() {
        System.out.println("A string instrument is playing.");
    }
}
