import java.awt.*;

public class Saab95 extends Car{
    private double currentSpeed;
    public Saab95(){
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
	    turboOn = false;
        modelName = "Saab95";
        stopEngine();
    }
/*
    public void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
        System.out.println("func");
        System.out.println(currentSpeed);
    }
*/
    // TODO fix this method according to lab pm
    public void gas(double amount){

        if (amount < 0 || amount > 1) {
            throw new IllegalArgumentException();
        }
        else {
            incrementSpeed(amount);
        }

    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if (amount < 0 || amount > 1) {
            throw new IllegalArgumentException();
        }
        else {
            decrementSpeed(amount);
        }
    }
}
