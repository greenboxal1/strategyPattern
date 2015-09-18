package mx.iteso.strategy.behaviors.impl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NotDeflatableTest {
    @Test
    public void notDeflatableDeflate() {
        NotDeflatable notDeflatableDeflate = new NotDeflatable();
        assertEquals("I can't deflate!", notDeflatableDeflate.deflate());
    }

    @Test
    public void notDeflatableInflate() {
        NotDeflatable notDeflatableInflate = new NotDeflatable();
        assertEquals("I can't inflate!", notDeflatableInflate.inflate());
    }
}
