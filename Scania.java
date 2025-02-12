import java.awt.*;

public class Scania extends TruckBed{

    public Scania(){
        super(2, 770, Color.BLUE, "Scania", 0 ,70);
    }

    @Override
    public void incrementSpeed(double amount) {
        if (getBedAngle() < getMinBedAngle()){
            throw new IllegalArgumentException("Rampen är uppe!");
        }
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    @Override
    public void decrementSpeed(double amount) {
        if (getBedAngle() > getMaxBedAngle()){
            throw new IllegalArgumentException("Rampen är uppe!");
        }
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;

    }

    @Override
    public double speedFactor() {
        return this.getEnginePower() / 100;
    }
}
