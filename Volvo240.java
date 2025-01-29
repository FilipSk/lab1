import java.awt.*;

public class Volvo240 extends Car{
    private double currentSpeed;
    public Volvo240(){
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }

    public void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        if (currentSpeed >= 1) {
            currentSpeed = 1;
        }
        else {
            incrementSpeed(amount);
        }

    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if (currentSpeed <= 0) {
            currentSpeed = 0;
        }
        else {
            decrementSpeed(amount);
        }
    }
}
