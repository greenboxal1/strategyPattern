package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandballBallTest {
    @Test
    public void testHandballBall() {
        HandballBall handballBall = new HandballBall();
        assertEquals("I'm bouncing normally!", handballBall.performBounce());
        assertEquals("I'm deflating!", handballBall.performDeflate());
        assertEquals("I'm inflating!", handballBall.performInflate());
        assertEquals("Hand ball is rolling!", handballBall.roll());
    }
}
