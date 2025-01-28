import java.awt.*;
import java.util.ArrayList;

public class Car implements Movable{
//t
    protected boolean turboOn;
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    private final static double trimFactor = 1.25;
    private double posX;
    private double posY;
    private int direction;

    int[] directionX = {1,0,-1,0 };
    int[] directionY = {0,-1,0,1 };

    // Array av vector2, [(1,0),(0,-1),(-1,0),(0,1)], int direction
    // Move x,y += array[direction] * speed



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

    public void setTurboOn(){
        turboOn = true;
    }

    public void setTurboOff(){
        turboOn = false;
    }

    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
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
        if (direction > 4){
            direction = 0;
        }
    }
}



//hej hej