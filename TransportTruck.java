import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;

public class TransportTruck extends Truck{

    private int numOfCars;
    private int maxNumOfCars = 10;
    private double maxCarSize = 5; // Längd i meter
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
    private void setCarPos(Car car){
        car.posX = this.posX;
        car.posY = this.posY;
    }
    public void loadCar(Car car, double distance) {
        if (car.getSize() <= maxCarSize || distance <= maxDistance ||
                numOfCars < maxNumOfCars || getCurrentSpeed() == 0 || !rampIsUp) {
            numOfCars += 1;
            cars.push(car.getname());
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
