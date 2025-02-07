import java.awt.*;
import java.util.ArrayList;

public class TransportTruck extends Truck{

    private int numOfCars;
    private int maxNumOfCars = 10;
    private double maxCarSize = 3; // Längd i meter
    private boolean rampIsUp;
    private boolean isMoving;
    private double maxDistance;
    private ArrayList<String> cars = new ArrayList<>();

    public TransportTruck(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    @Override
    public void incrementSpeed(double amount) {

    }

    @Override
    public void decrementSpeed(double amount) {

    }

    @Override
    public double speedFactor() {
        return 0;
    }

    public void loadCar(double carSize, String carName, double distance) {
        if (carSize <= maxCarSize || distance <= maxDistance || numOfCars < maxNumOfCars) {
            numOfCars += 1;
            cars.add(carName);
        }
        else {
            System.out.println("Error!");
        }
    }

    public void deloadCar(double carSize, String carName, double distance) {
        if (cars.contains(carName) || carSize <= maxCarSize || distance <= maxDistance || numOfCars < maxNumOfCars) {
            numOfCars -= 1;
            cars.remove(carName);

        }
        else {
            System.out.println("Error!");
        }
    }

    @Override
    public void increaseBedAngle() {

    }

    @Override
    public void decreaseBedAngle() {

    }

    @Override
    public void getBedAngle() {

    }
}
