public class Car {

    public static final String brand = "Fiat";
    public static String model = "CDE456";
    public final int power;

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
