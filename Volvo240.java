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
/*
    public void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }
*/
    // TODO fix this method according to lab pm
    public void gas(double amount){
        if (amount > 1 || amount < 0) {
                throw new IllegalArgumentException();
            //} catch (Exception e) {
            //    System.out.println("Too much gas, the car will break! " + e.toString());
            //}
        }
        else {
            incrementSpeed(amount);
        }

    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if (amount < 0 || amount > 1 ) {
            try {
                throw new IllegalArgumentException();
            } catch (Exception e) {
                System.out.println("Din bil har inte ABS!! " + e.toString());
            }
        }
        else {
            decrementSpeed(amount);
        }
    }
}
