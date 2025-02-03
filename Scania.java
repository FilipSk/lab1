import java.awt.*;

public class Scania extends Car{

    private float bedAngle;
    private float maxBedAngle;
    private float minBedAngle;

    //amount that changes the angle of the truck bed
    private float angleChange;

    public Scania(){
        super(2, 770, Color.BLUE, "Scania");

    }
    public float getAngleOfTruckBed(){
        return bedAngle;
    }
    public void increaseBedAngle(){
        if (bedAngle + angleChange > maxBedAngle && currentSpeed == 0){
            return;
        }
        bedAngle += angleChange;
    }
    public void decreaseBedAngle(){
        if (bedAngle + angleChange < minBedAngle && currentSpeed == 0){
            return;
        }
        bedAngle -= angleChange;
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
        if (bedAngle > minBedAngle){
            return;
        }
    }

    @Override
    public double speedFactor() {
        return 0;
    }
}
