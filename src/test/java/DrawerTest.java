import drawer.Drawer;
import drawer.DrawerCode;
import org.junit.Before;
import org.junit.Test;
import product.Drink;

import static org.junit.Assert.assertEquals;

public class DrawerTest {

    Drink drink;
    Drawer drawer;

    @Before
    public void setUp() {

        drink = new Drink("Cola", "Coca Cola");
        drawer = new Drawer(DrawerCode.A1, 44);
    }

    @Test
    public void canGetDrawerCode () {
        assertEquals(DrawerCode.A1, drawer.getDrawerCode());
    }

    @Test
    public void canSetDrawerCode () {
        drawer.setCode(DrawerCode.A2);
        assertEquals(DrawerCode.A2, drawer.getDrawerCode());
    }

    @Test
    public void canGetPrice() {
        assertEquals(44, drawer.getPrice());
    }

    @Test
    public void canSetPrice() {
        drawer.setPrice(33);
        assertEquals(33, drawer.getPrice());
    }

    @Test
    public void canAddProduct() {
        drawer.addProduct(drink);
        assertEquals(1, drawer.countProducts());
    }

    @Test
    public void canReturnProduct() {
        drawer.addProduct(drink);
        assertEquals(drink, drawer.returnProduct());
    }

}
