package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TenisBallTest {
    @Test
    public void testTenisBall() {
        TenisBall tenisBall = new TenisBall();
        assertEquals("I'm bouncing normally!", tenisBall.performBounce());
        assertEquals("I can't deflate!", tenisBall.performDeflate());
        assertEquals("I can't inflate!", tenisBall.performInflate());
        assertEquals("Tenis ball is rolling!", tenisBall.roll());
    }
}
