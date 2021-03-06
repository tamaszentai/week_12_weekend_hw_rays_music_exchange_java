import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {


    private Shop shop;
    private ISell guitartosell;
    private ISell guitarpick;
    private ISell drumstick;


    @Before
    public void before(){
        this.shop = new Shop();
        this.guitartosell = new GuitarToSell("mahagony", "black", InstrumentType.STRING,
                8, "electric-guitar", 1000, 1200);
        this.guitarpick = new GuitarPick("guitar-pick", 0.30, 1);
        this.drumstick = new DrumStick("drumstick", 3, 5);


    }

    @Test
    public void canAddItemToStock(){
        shop.addItemToStock(guitartosell);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addItemToStock(guitartosell);
        shop.addItemToStock(guitartosell);
        shop.addItemToStock(guitartosell);
        assertEquals(2, shop.removeItem(guitartosell));
    }

    @Test
    public void hasProfit(){
        shop.addItemToStock(guitartosell);
        shop.addItemToStock(guitarpick);
        shop.addItemToStock(drumstick);
        assertEquals(202.7, shop.totalProfit(), 0.1);
    }
}
