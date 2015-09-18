package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LifeVestsTest {
    @Test
    public void testLifeVests() {
        LifeVests lifeVests = new LifeVests();
        assertEquals("I'm inflating!", lifeVests.inflating());
        assertEquals("I'm deflating!", lifeVests.deflating());
        assertEquals("I'm floating!", lifeVests.floating());
        assertEquals("I'm a Life Vest", lifeVests.display());
    }
}
