void main(String[] args) {

    Car car1 = new Car(90);
    Car car2 = new Car(29);
    car1.accelerate();
    Car.brake();

    System.out.println("Car1 brand:" + Car.brand + "Car1 model: " + Car.model );
    System.out.println("Car2 model: " + Car.model );

    Car.model = "ABC123";
    Car.brand = "TIFA"; //Brand can not change

    System.out.println("Car1 brand after the change: " + Car.brand + " Car1 model after the change: " + Car.model );
    System.out.println("Car2 model after the change: " + Car.model );

}