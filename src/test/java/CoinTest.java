import coin.Coin;
import coin.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {


    Coin coin5p;
//    Coin coin10p;
//    Coin coin20p;
//    Coin coin50p;
//    Coin coin100p;
//    Coin coin200p;


    @Before
    public void setUp() {
        coin5p = new Coin(CoinType.FIVEPENCE);

    }

    @Test
    public void canGetCoinValue () {
        assertEquals(5, coin5p.getCoinValue());
    }

//    @Test
//    public void canRejectSmallChange () {
//        assertEquals(5, coin5p.getCoinValue());
//    }



}
