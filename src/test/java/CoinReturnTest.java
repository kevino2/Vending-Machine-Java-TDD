import coin.Coin;
import coin.CoinReturn;
import coin.CoinType;
import org.junit.Before;
import org.junit.Test;

import static coin.CoinType.FIVEPENCE;
import static org.junit.Assert.assertEquals;

public class CoinReturnTest {

    CoinReturn coinReturn;
    Coin coin1p;
    Coin coin2p;
    Coin coin5p;
    Coin coin10p;
    Coin coin20p;
    Coin coin50p;
    Coin coin100p;
    Coin coin200p;


    @Before
    public void setUp() {
        coinReturn = new CoinReturn();


        coin1p = new Coin(CoinType.ONEPENCE);
        coin2p = new Coin(CoinType.TWOPENCE);
        coin5p = new Coin(FIVEPENCE);
        coin10p = new Coin(CoinType.TENPENCE);
        coin20p = new Coin(CoinType.TWENTYPENCE);
        coin50p = new Coin(CoinType.FIFTYPENCE);
        coin100p = new Coin(CoinType.ONEPOUND);
        coin200p = new Coin(CoinType.TWOPOUND);


    }

    @Test
    public void canAddCoin__and__getTotalValue() {
        coinReturn.addCoin(coin5p);
        assertEquals(5, coinReturn.getTotalValue());
    }

    @Test
    public void canAddManyCoins__and__getTotalValue() {
        coinReturn.addCoin(coin5p);
        coinReturn.addCoin(coin10p);
        coinReturn.addCoin(coin20p);
        coinReturn.addCoin(coin50p);
        coinReturn.addCoin(coin100p);
        coinReturn.addCoin(coin200p);

        assertEquals(385, coinReturn.getTotalValue());
    }

    @Test
    public void canRejectSmallChange() {
        coinReturn.addCoin(coin1p);
        coinReturn.addCoin(coin2p);

        assertEquals(0, coinReturn.getTotalValue());
    }

}
