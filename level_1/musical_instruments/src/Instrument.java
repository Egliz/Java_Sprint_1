abstract class Instrument {

    private String name;
    private int price;
    public static String colorDemoLoadClass = "brown";

    static {
        System.out.println("Instrument class loaded.");
    }

    public Instrument(String name, int price) {

        this.name = name;
        this.price = price;
    }

    abstract void play();
}
