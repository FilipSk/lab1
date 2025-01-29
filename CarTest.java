import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;
class CarTest {
    Volvo240 volvo = new Volvo240();
    Saab95 saab = new Saab95();
    @BeforeEach
    void createNewCars() {
        volvo = new Volvo240();
        saab = new Saab95();
    }

    @Test
    void getNrDoors() {

        assertEquals(4, volvo.getNrDoors());
        assertEquals(2, saab.getNrDoors());

    }
    @Test
    void getEnginePower() {
        assertEquals(100, volvo.getEnginePower());
        assertEquals(125, saab.getEnginePower());
    }
    @Test
    void getColor() {
        assertEquals(Color.black, volvo.getColor());
        assertEquals(Color.red, saab.getColor());
    }
    @Test
    void move() {
        saab.startEngine();
        double firstY = saab.posY;
        double firstX = saab.posX;
        saab.move();

        assertNotEquals(firstX, saab.posX);
        assertEquals(firstY, saab.posY);
    }

    @Test
    void turnLeft() {
        volvo.startEngine();
        double firstY = volvo.posY;
        double firstX = volvo.posX;
        volvo.move();
        volvo.turnLeft();
        volvo.move();
        volvo.turnRight();
        assertNotEquals(firstX, volvo.posX);
        assertNotEquals(firstY, volvo.posY);
    }
}