package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwimSeatsTest {
    @Test
    public void testSwimSeats() {
        SwimSeat swimSeat = new SwimSeat();
        assertEquals("I'm inflating!", swimSeat.inflating());
        assertEquals("I'm deflating!", swimSeat.deflating());
        assertEquals("I'm floating!", swimSeat.floating());
        assertEquals("I'm a Swim Seat", swimSeat.display());
    }
}
