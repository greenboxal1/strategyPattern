package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterTubesTest {
    @Test
    public void testWaterTubes() {
        WaterTubes waterTubes = new WaterTubes();
        assertEquals("I'm inflating!", waterTubes.inflating());
        assertEquals("I'm deflating!", waterTubes.deflating());
        assertEquals("I'm floating!", waterTubes.floating());
        assertEquals("I'm a Water Tubes", waterTubes.display());
    }
}
