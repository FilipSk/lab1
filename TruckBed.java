import java.awt.*;

public abstract class TruckBed extends Truck {

    private double bedAngle;
    public final double maxBedAngle;
    public final double minBedAngle;

    public TruckBed(int nrDoors, double enginePower, Color color, String modelName, double _minBedAngle, double _maxBedAngle) {
        super(nrDoors, enginePower, color, modelName);
        this.maxBedAngle = _maxBedAngle;
        this.minBedAngle = _minBedAngle;
    }

    public void increaseBedAngle(double angle) {
        bedAngle += angle;
        if (bedAngle > maxBedAngle) {
            bedAngle = maxBedAngle;
        }
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
}