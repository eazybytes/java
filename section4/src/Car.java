public class Car {

    String model;
    String color;
    int horsePower;
    static final byte NO_OF_WHEELS = 4;
    static  byte noOfEngines;

    static {
        noOfEngines = 1;
        System.out.println("static blocking is being executed");
    }

    {
        System.out.println("Car object is being created....");
    }

    public Car () {

    }

    public Car (String model, String color, int horsePower) {
        this.model = model;
        this.horsePower = horsePower;
        this.color =color;
    }

    public void startCar( ) {
        System.out.println("Vehicle started...");
    }

    public String stopCar( ) {
        String output = "Vehicle stopped...";
        return output;
    }

}
