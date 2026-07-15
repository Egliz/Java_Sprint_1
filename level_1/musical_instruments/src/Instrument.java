abstract class Instrument {

    private String name;
    private int price;

    public Instrument(String name, int price) {

        this.name = name;
        this.price = price;
    }

    abstract void play() {
        System.out.println("An instrument is playing.");
    }
}
