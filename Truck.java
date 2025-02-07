import java.awt.*;
import java.util.ArrayList;

public abstract class Truck extends Vehicle implements TruckBed{


    public Truck(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

//    @Override
//    public void incrementSpeed(double amount) {
//        currentSpeed = getCurrentSpeed() + 1 * amount;
//    }
//
//    @Override
//    public void decrementSpeed(double amount) {
//        currentSpeed = getCurrentSpeed() - 1 * amount;
//    }
//    @Override
//    public double speedFactor() {
//        return 0;
//    }
}
