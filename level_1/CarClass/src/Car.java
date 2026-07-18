public class Car {

    private static final String brand = "Fiat";
    private static String model = "yhd22";
    private final int power;

    public Car (int power) {
        this.power = power;
    }

   public static void brake() {
        System.out.println("The vehicle is braking.");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }

    }
