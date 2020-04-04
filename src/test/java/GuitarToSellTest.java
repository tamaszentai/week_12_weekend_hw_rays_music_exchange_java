import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarToSellTest {

    private GuitarToSell guitarToSell;

    @Before
    public void before(){
        this.guitarToSell = new GuitarToSell("mahagony", "white", InstrumentType.STRING, 8,
                "extendedrange-electricguitar", 1300, 1600);
    }

    @Test
    public void hasMaterial(){
        assertEquals("mahagony", guitarToSell.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("white", guitarToSell.getColour());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRING, guitarToSell.getType());
    }

    @Test
    public void howManyStringsItHas(){
        assertEquals(8, guitarToSell.getNumberOfStrings());
    }

    @Test
    public void hasSound(){
        assertEquals("guitarsound", guitarToSell.play());
    }
}
