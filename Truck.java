import java.awt.*;
import java.util.ArrayList;

public class Truck extends Car{
    private int numOfCars;
    private int maxNumOfCars = 10;
    private double maxCarSize = 3; // Längd i meter
    private boolean rampIsUp;
    private boolean isMoving;
    private double maxDistance;
    private ArrayList<String> cars = new ArrayList<>();

    public Truck() {
        super(2, 780, Color.black, "Volvo FH16");
    }

    public void loadCar(double carSize, String carName, double distance) {
        if (carSize <= maxCarSize || distance <= maxDistance || numOfCars < maxNumOfCars || !isMoving || rampIsUp) {
            numOfCars += 1;
            cars.add(carName);
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

    public void speedFactor() {

    }
}
