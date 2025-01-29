import java.awt.*;
import java.util.ArrayList;

public class Car implements Movable{
//t
    private int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    protected double posX;
    protected double posY;

    private int direction;
    private int[] directionX = {1,0,-1,0 };
    private int[] directionY = {0,-1,0,1 };

    // Array av vector2, [(1,0),(0,-1),(-1,0),(0,1)], int direction
    // Move x,y += array[direction] * speed
    public Car(int nrDoors, double enginePower, Color color, String modelName){
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        stopEngine();

    }


    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }





    public void incrementSpeed(double amount){
        //currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    public void decrementSpeed(double amount) {
        //currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }

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

    @Override
    public void move() {
        posX += directionX[direction] * getCurrentSpeed();
        posY += directionY[direction] * getCurrentSpeed();
    }

    @Override
    public void turnLeft() {
        direction -=1;
        if (direction < 0){
            direction = 3;
        }

    }

    @Override
    public void turnRight() {
        direction +=1;
        if (direction > 3){
            direction = 0;
        }
    }


}



//hej hej