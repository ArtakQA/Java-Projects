public class Helicopter {
    // data members
    private String make;
    private String model;
    private int year;
    private int numPassengers;

    // constructor
    public Helicopter(String make, String model, int year, int numPassengers) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numPassengers = numPassengers;
    }

    // getters and setters for data members
    public String getMake() {
        return make;
    }

    public String setMake(String make) {
        this.make = make;
        return make;
    }

    public String getModel() {
        return model;
    }

    public String setModel(String model) {
        this.model = model;
        return model;
    }

    public int getYear() {
        return year;
    }

    public int setYear(int year) {
        this.year = year;
        return year;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public int setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
        return numPassengers;
    }

    public void startEngine() {
        System.out.println("Starting engine...");
    }


    public void fly() {
        System.out.println("Flying...");
    }

    public void land() {
        System.out.println("Landing...");
    }
}
class helinstance {
    Helicopter ex1 = new Helicopter("Bell","30",1942,6);
    public void Useex1() {

        ex1.startEngine();
        ex1.fly();
        ex1.land();
        System.out.println("The good job boys");
    }
}
