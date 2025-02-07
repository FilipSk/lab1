import java.awt.*;
import java.util.ArrayList;

public class Truck extends Flak{
    private int numOfCars;
    private int maxNumOfCars = 10;
    private double maxCarSize = 3; // Längd i meter
    private boolean rampIsUp;
    private boolean isMoving;
    private double maxDistance;
    private ArrayList<String> cars = new ArrayList<>();

    public Truck() {
        super(2, 780, Color.black, "Volvo FH16", 0,70);
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
        if (cars.contains(carName) || carSize <= maxCarSize || distance <= maxDistance || numOfCars < maxNumOfCars ||) {
            numOfCars -= 1;
            cars.remove(carName);

        }
        else {
            System.out.println("Error!");
        }
    }


    @Override
    public void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + 1 * amount;
    }

    @Override
    public void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - 1 * amount;
    }
    @Override
    public double speedFactor() {
        return 0;
    }
}
