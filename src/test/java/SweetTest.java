import org.junit.Before;
import org.junit.Test;
import product.Drink;
import product.Sweet;

import static org.junit.Assert.assertEquals;

public class SweetTest {
    Sweet sweet;

    @Before
    public void setUp() {

        sweet = new Sweet ("Kit Kat", "Nestle");

    }

    @Test
    public void getName() {
        assertEquals("Kit Kat", sweet.getName());
    }

    @Test
    public void setName() {
        sweet.setName("Kit Kat");
        assertEquals("Kit Kat", sweet.getName());
    }

    @Test
    public void getBrand() {
        assertEquals("Nestle", sweet.getBrand());
    }

    @Test
    public void setBrand() {
        sweet.setBrand("Nastle");
        assertEquals("Nastle", sweet.getBrand());
    }
}


