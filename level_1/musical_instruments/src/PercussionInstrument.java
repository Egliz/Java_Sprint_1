public class PercussionInstrument extends Instrument {

    public PercussionInstrument (String name, int price) {
        super(name, price);
    }

    @Override
    void play() {
        System.out.println("A percussion instrument is playing.");
    }
}
