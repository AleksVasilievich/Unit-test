package DZ_2;

public abstract class Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    protected int numWheels;
    protected int speed;

    public Vehicle(String company, String model, int yearRelease) {
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
    }

    public Vehicle() {

    }
    public Vehicle(int numWheels) {
        this.numWheels = numWheels;
        this.speed = 0;
    }

    public abstract void testDrive();

    public abstract void park();

    public int getNumWheels() {
        return numWheels;
    }

    public int getSpeed() {
        return speed;
    }

}

