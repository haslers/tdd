package de.fjd.fim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class MarsRoverTest {

    @Test
    public void shouldHaveInitialStartingPoint() {
        assertEquals("0,0,N", new MarsRover().getPosition());

    }

    @Test
    public void moveMinimalForward(){
        MarsRover marsRover = new MarsRover();
        marsRover.move("F");

        assertEquals("0,1,N", marsRover.getPosition());
    }

    @Test
    public void moveMinimalBackward() {
        MarsRover marsRover = new MarsRover();
        marsRover.move("F");
        marsRover.move("B");
        assertEquals("0,0,N", marsRover.getPosition());
    }
}
