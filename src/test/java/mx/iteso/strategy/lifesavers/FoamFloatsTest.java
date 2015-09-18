package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FoamFloatsTest {
    @Test
    public void testFoamFloats() {
        FoamFloats foamFloats = new FoamFloats();
        assertEquals("I can't deflate!", foamFloats.notDeflating());
        assertEquals("I can't inflate!", foamFloats.notInflating());
        assertEquals("I'm floating!", foamFloats.floating());
        assertEquals("I'm a Foam Floats", foamFloats.display());
    }
}
