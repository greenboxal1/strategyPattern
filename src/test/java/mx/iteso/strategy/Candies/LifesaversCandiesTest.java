package mx.iteso.strategy.Candies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LifesaversCandiesTest {
    @Test
    public void testLifesaversCandies() {
        LifesaversCandies lifesaversCandies = new LifesaversCandies();
        assertEquals("I'm floating!", lifesaversCandies.performFloat());
        assertEquals("I can't inflate!", lifesaversCandies.performInflate());
        assertEquals("I can't deflate!", lifesaversCandies.performDeflate());
        assertEquals("I'm a Lifesavers Candies", lifesaversCandies.display());
    }
}
