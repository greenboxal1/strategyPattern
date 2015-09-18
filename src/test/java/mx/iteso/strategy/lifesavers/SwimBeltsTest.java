package mx.iteso.strategy.lifesavers;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SwimBeltsTest {
    @Test
    public void testSwimBelts() {
        SwimBelts swimBelts = new SwimBelts();
        assertEquals("I can't deflate!", swimBelts.notDeflating());
        assertEquals("I can't inflate!", swimBelts.notInflating());
        assertEquals("I'm floating!", swimBelts.floating());
        assertEquals("I'm a Swim Belt", swimBelts.display());
    }
}
