import java.awt.*;

public class Volvo240 extends Car{
    private double currentSpeed;
    public Volvo240(){
        super(4, 100, Color.BLACK, "Volvo240");
    }
    /*
    public void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }
    // TODO fix this method according to lab pm
    public void gas(double amount){
        if (amount > 1 || amount < 0) {
            throw new IllegalArgumentException();
        }
        else {
            incrementSpeed(amount);
        }

    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if (amount < 0 || amount > 1 ) {
            throw new IllegalArgumentException();
        }
        else {
                decrementSpeed(amount);
             }
        }
        */
}
