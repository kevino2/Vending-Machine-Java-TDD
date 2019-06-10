import org.junit.Before;
import org.junit.Test;
import product.Crisps;
import product.Drink;

import static org.junit.Assert.assertEquals;

public class CrispsTest {

    Crisps crisps;

    @Before
    public void setUp() {

        crisps = new Crisps ("Beef", "Monster Munch");

    }

    @Test
    public void getName() {
        assertEquals("Beef", crisps.getName());
    }

    @Test
    public void setName() {
        crisps.setName("Boof");
        assertEquals("Boof", crisps.getName());
    }

    @Test
    public void getBrand() {
        assertEquals("Monster Munch", crisps.getBrand());
    }

    @Test
    public void setBrand() {
        crisps.setBrand("Cocaine Cola");
        assertEquals("Cocaine Cola", crisps.getBrand());
    }
}


