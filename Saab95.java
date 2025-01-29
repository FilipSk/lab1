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
            try {
                throw new IllegalArgumentException();
            } catch (Exception e) {
                System.out.println("Du kan inte ge denna gasen " + e.toString());
            }
        }
        else {
            incrementSpeed(amount);
        }

    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if (amount < 0 || amount > 1) {
            try {
                throw new IllegalArgumentException();
            } catch (Exception e) {
                System.out.println("Du kan ej bromsa så här " + e.toString());
            }
        }
        else {
            decrementSpeed(amount);
        }
    }
}
