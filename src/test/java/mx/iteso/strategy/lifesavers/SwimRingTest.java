package mx.iteso.strategy.lifesavers;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SwimRingTest {
    @Test
    public void testSwimRing() {
        SwimRing swimRing = new SwimRing();
        assertEquals("I'm inflating!", swimRing.inflating());
        assertEquals("I'm deflating!", swimRing.deflating());
        assertEquals("I'm floating!", swimRing.floating());
        assertEquals("I'm a Swim Ring", swimRing.display());
    }
}
