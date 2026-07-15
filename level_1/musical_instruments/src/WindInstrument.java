public class WindInstrument extends Instrument {

    public WindInstrument (String name, int price) {
        super(name, price);
    }

    @Override
    void play() {
        System.out.println("A wind instrument is playing.");
    }
}
