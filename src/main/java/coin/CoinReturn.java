package coin;

import java.util.ArrayList;

public class CoinReturn {

    private ArrayList<Coin> coins;

    public CoinReturn() {
        this.coins = new ArrayList<Coin>();
    }


    public void addCoin (Coin coin) {

        if (coin.getCoinValue() > 2) {

            this.coins.add(coin);
        }
    }

    public int getTotalValue () {
        int totalValue = 0;
        for (Coin coin : coins) {
            totalValue += coin.getCoinValue();
        }
        return totalValue;
    }


}
