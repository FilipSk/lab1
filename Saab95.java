import java.awt.*;

public class Saab95 extends Car{
    
    public Saab95(){
        //nrDoors = 2;
        //color = Color.red;
        // enginePower = 125;
	    //turboOn = false;
        //modelName = "Saab95";
        //stopEngine();
    }

    public void incrementSpeed(double amount){
       // currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount){
        //currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}
