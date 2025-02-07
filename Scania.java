import java.awt.*;

public class Scania extends Truck{

    private double bedAngle;
    private final double maxBedAngle;
    private final double minBedAngle;

    public Scania(){
        super(2, 770, Color.BLUE, "Scania");
        maxBedAngle = 70;
        minBedAngle = 0;
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

    @Override
    public void incrementSpeed(double amount) {
        if (bedAngle > minBedAngle){
            return;
        }
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    @Override
    public void decrementSpeed(double amount) {
        if (bedAngle > maxBedAngle){
            return;
        }
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;

    }

    @Override
    public double speedFactor() {
        return 0;
    }
}
