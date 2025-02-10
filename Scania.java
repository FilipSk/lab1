import java.awt.*;

public class Scania extends TruckBed{

    public Scania(){
        super(2, 770, Color.BLUE, "Scania", 0 ,70);
    }

    @Override
    public void incrementSpeed(double amount) {
        if (getBedAngle() > minBedAngle){
            return;
        }
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    @Override
    public void decrementSpeed(double amount) {
        if (getBedAngle() > maxBedAngle){
            return;
        }
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;

    }

    @Override
    public double speedFactor() {
        return 0;
    }
}
