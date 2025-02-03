import java.awt.*;

public abstract class Flak extends Car{
    private double bedAngle;
    private final double maxBedAngle;
    private final double minBedAngle;

    //amount that changes the angle of the truck bed
    private double angleChange;

    public Flak(int nrDoors, double enginePower, Color color, String modelName, double _minBedAngle, double _maxBedAngle) {
        super(nrDoors, enginePower, color, modelName);
        this.bedAngle = 0;
        this.minBedAngle = _minBedAngle;
        this.maxBedAngle = _maxBedAngle;
    }
    public double getAngleOfTruckBed(){
        return bedAngle;
    }
    public double getMaxAngleOfTruckBed(){
        return maxBedAngle;
    }
    public double getMinOfTruckBed(){
        return minBedAngle;
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
}
