package coin;

public class Coin {

    private CoinType coinType;

    public Coin (CoinType coinType) {
        this.coinType = coinType;
    }



    public int getCoinValue() {
        return this.coinType.getCoinValue();
    }



}
