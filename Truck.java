import java.awt.*;
import java.util.ArrayList;

public abstract class Truck extends Vehicle{
    private double bedAngle;
    public final double maxBedAngle;
    public final double minBedAngle;

    public Truck(int nrDoors, double enginePower, Color color, String modelName, double minBedAngle, double maxBedAngle) {
        super(nrDoors, enginePower, color, modelName);
        this.maxBedAngle = maxBedAngle;
        this.minBedAngle = minBedAngle;
        this.bedAngle = minBedAngle;
    }
    public Truck(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
        this.maxBedAngle = 0;
        this.minBedAngle = 0;
        this.bedAngle = 0;
    }
    public void increaseBedAngle(double angle) {
        bedAngle += angle;
        if (bedAngle > maxBedAngle) {
            bedAngle = maxBedAngle;
        }
    }

    public double getMinBedAngle() {
        return minBedAngle;
    }

    public void decreaseBedAngle(double angle) {
        bedAngle -= angle;
        if (bedAngle < minBedAngle) {
            bedAngle = minBedAngle;
        }
    }

    public double getBedAngle() {
        return bedAngle;
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
