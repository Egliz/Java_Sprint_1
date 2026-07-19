public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone (String brand, String model) {
        super(brand, model);
    }


    public void takePhoto (){
        System.out.println("Taken a photo.");
    }


    public void alarm (){
        System.out.println("Alarm sounding...");
    }

}
