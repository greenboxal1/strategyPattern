package mx.iteso.strategy.balls;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketballBallTest {
    @Test
    public void testSoccerBall() {
        BasketballBall basketballBall = new BasketballBall();
        assertEquals("I'm bouncing normally!", basketballBall.performBounce());
        assertEquals("I'm deflating!", basketballBall.performDeflate());
        assertEquals("I'm inflating!", basketballBall.performInflate());
        assertEquals("Basket ball is rolling!", basketballBall.roll());
    }
}
