import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;

public class TransportTruck extends Truck{

    private int numOfCars;
    private int maxNumOfCars = 10;
    private double maxCarSize = 3; // Längd i meter
    private boolean rampIsUp;
    private double maxDistance;
    private Stack<String> cars = new Stack<>();

    public TransportTruck(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName, 0,1);
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
        if (carSize <= maxCarSize || distance <= maxDistance ||
                numOfCars < maxNumOfCars || getCurrentSpeed() == 0 || !rampIsUp) {
            numOfCars += 1;
            cars.push(carName);
        }
        else {
            throw new IllegalArgumentException("Error!");
        }
    }

    public void deloadCar() {
        if (getCurrentSpeed() == 0 || !rampIsUp) {
            if (numOfCars != 0) {
                numOfCars -= 1;
                cars.pop();
            }
            else {
                throw new IllegalArgumentException("No cars on the truck");
            }
        }
        else {
            System.out.println("Error!");
        }
    }

}
