void main(String[] args) {


    System.out.println(Instrument.colorDemoLoadClass);

    Instrument flute = new WindInstrument ("Flute", 20);
    flute.play();

    Instrument violin = new StringInstrument("Violin", 30);
    violin.play();

    Instrument maraca = new PercussionInstrument("Maraca", 40);
    maraca.play();







}