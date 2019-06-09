import org.junit.Before;
import org.junit.Test;
import product.Drink;

import static org.junit.Assert.assertEquals;

public class DrinkTest {


    Drink drink;

    @Before
    public void setUp() {

        drink = new Drink ("Cola", "Coca Cola");

    }

    @Test
    public void getName() {
        assertEquals("Cola", drink.getName());
    }

    @Test
    public void setName() {
        drink.setName("Coke");
        assertEquals("Coke", drink.getName());
    }

    @Test
    public void getBrand() {
        assertEquals("Coca Cola", drink.getBrand());
    }

    @Test
    public void setBrand() {
        drink.setBrand("Cocaine Cola");
        assertEquals("Cocaine Cola", drink.getBrand());
    }
}
