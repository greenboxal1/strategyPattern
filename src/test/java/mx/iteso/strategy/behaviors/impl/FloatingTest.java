package mx.iteso.strategy.behaviors.impl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FloatingTest {
    @Test
    public void testFloating() {
        Floating floating = new Floating();
        assertEquals("I'm floating!", floating.floating());
    }

    @Test
    public void testSumberging() {
        Floating sumbering = new Floating();
        assertEquals("I'm submerging!", sumbering.submerging());
    }
}
