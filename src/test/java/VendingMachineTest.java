import coin.Coin;
import coin.CoinType;
import drawer.Drawer;
import drawer.DrawerCode;
import org.junit.Before;
import org.junit.Test;
import vendingMachine.VendingMachine;

import static coin.CoinType.FIVEPENCE;
import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    Drawer drawer1;
    VendingMachine vendingMachine;
    Coin coin1p;
    Coin coin2p;
    Coin coin5p;
    Coin coin10p;
    Coin coin20p;
    Coin coin50p;


    @Before
    public void setUp() {
        drawer1 = new Drawer(DrawerCode.A1, 45);
        coin1p = new Coin(CoinType.ONEPENCE);
        coin2p = new Coin(CoinType.TWOPENCE);
        coin5p = new Coin(FIVEPENCE);
        coin10p = new Coin(CoinType.TENPENCE);
        coin20p = new Coin(CoinType.TWENTYPENCE);
        coin50p = new Coin(CoinType.FIFTYPENCE);
        vendingMachine = new VendingMachine();

    }

//    @Test
//    public void canAddDrawer() {
//        assertEquals(drawer1, vendingMachine.addDrawer(drawer1).);
//    }


    @Test
    public void canAddCoin() {
        vendingMachine.addCoin(coin20p);
        vendingMachine.addCoin(coin20p);
        vendingMachine.addCoin(coin5p);
        assertEquals(45, vendingMachine.getEnteredCoinsValue());
    }

    @Test
    public void canReturnSmallChange() {
        vendingMachine.addCoin(coin2p);
        vendingMachine.addCoin(coin1p);
        assertEquals(3, vendingMachine.getCoinReturnValue());
    }
    @Test
public


