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
    public void moveMinimal(){
        MarsRover marsRover = new MarsRover();
        marsRover.move("F");


        assertEquals("0,1,N", new MarsRover().getPosition());
    }
}
