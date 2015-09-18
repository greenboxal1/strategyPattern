package mx.iteso.strategy.balls;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BillarBallTest {
    @Test
    public void testBillarBall() {
        BillarBall billarBall = new BillarBall();
        assertEquals("I'm bouncing irregularly!", billarBall.performBounce());
        assertEquals("I can't deflate!", billarBall.performDeflate());
        assertEquals("I can't inflate!", billarBall.performInflate());
        assertEquals("Billar ball is rolling!", billarBall.roll());
    }
}
